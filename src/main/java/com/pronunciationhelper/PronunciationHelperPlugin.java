package com.pronunciationhelper;

import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.api.widgets.ComponentID;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import javax.inject.Inject;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
@PluginDescriptor(
		name = "Pronunciation Helper"
)
public class PronunciationHelperPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private PronunciationHelperConfig config;

	@Inject
	private KeyManager keyManager;

	private String lastTextProcessed;
	private boolean showOnlyTranslation = false;
	private String originalText;


	private final KeyListener translationKeyListener = new KeyListener()
	{
		@Override
		public void keyTyped(KeyEvent e) { }

		@Override
		public void keyPressed(KeyEvent e)
		{
			if (config.pronunciationHotkey().matches(e))
			{
				showOnlyTranslation = true;
				//allow the sub to take place
				lastTextProcessed = "";
			}
		}

		@Override
		public void keyReleased(KeyEvent e)
		{
			if (config.pronunciationHotkey().matches(e))
			{
				showOnlyTranslation = false;
				lastTextProcessed = "";
			}
		}
	};

	@Override
	protected void startUp()
	{
		log.debug("Pronunciation Helper started!");
		keyManager.registerKeyListener(translationKeyListener);
	}

	@Override
	protected void shutDown()
	{
		keyManager.unregisterKeyListener(translationKeyListener);
		log.debug("Pronunciation Helper stopped!");
	}

	@Subscribe
	public void onGameTick(GameTick tick)
	{
		handleDialogueWidget(client.getWidget(ComponentID.DIALOG_NPC_TEXT));
		handleDialogueWidget(client.getWidget(ComponentID.DIALOG_PLAYER_TEXT));
	}

	private void handleDialogueWidget(Widget widget)
	{
		if (widget == null) return;

		String text = widget.getText();
		if (isUnmodifiedText(text))
		{
			originalText = text;
		}

		if (originalText == null || originalText.isEmpty()) return;

		//this check is needed or we will keep replacing the word forever overflowing the message container
		if (!text.equals(lastTextProcessed))
		{
			String newText = originalText;
			Color color = config.pronunciationColor();
			String colorHex = String.format("%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());

			for (Map.Entry<String, String> entry : PronunciationHelperDictionary.PRONUNCIATIONS.entrySet())
			{
				String word = entry.getKey();
				String pronunciation = entry.getValue();

				//make sure we can actually match entries when casing doesnt match the dictionary
				Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b", Pattern.CASE_INSENSITIVE);
				Matcher matcher = pattern.matcher(newText);

				StringBuffer sb = new StringBuffer();
				while (matcher.find())
				{
					String matchedWord = matcher.group();

					//the reason we do it this way is to preserve the original casing of the word in the text.
					//The previous approach would sometimes capitalize words that were not originally capitalized
					String replacement = showOnlyTranslation
							? "<col=" + colorHex + ">" + pronunciation + "</col>"
							: (config.alwaysShow()
							? matchedWord + " (<col=" + colorHex + ">" + pronunciation + "</col>)"
							: matchedWord);

					matcher.appendReplacement(sb, Matcher.quoteReplacement(replacement));
				}
				matcher.appendTail(sb);
				newText = sb.toString();
			}

			if (!newText.equals(text))
			{
				widget.setText(newText);
				widget.revalidate();
			}

			lastTextProcessed = newText;
		}

	}

	//returns weather text has <col=..> in it or not
	private boolean isUnmodifiedText(String text) {
		return !text.contains("<col=");
	}

	@Provides
	PronunciationHelperConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(PronunciationHelperConfig.class);
	}
}
