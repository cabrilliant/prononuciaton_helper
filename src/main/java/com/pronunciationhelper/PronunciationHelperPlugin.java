package com.pronunciationhelper;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.events.GameTick;
import net.runelite.api.widgets.ComponentID;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

import java.util.Map;

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

	private String lastTextProcessed;

	@Override
	protected void startUp()
	{
		log.debug("Pronunciation Helper started!");
	}

	@Override
	protected void shutDown()
	{
		log.debug("Pronunciation Helper stopped!");
	}

	@Subscribe
	public void onGameTick(GameTick tick)
	{
		// NPC dialogue text
		handleDialogueWidget(client.getWidget(ComponentID.DIALOG_NPC_TEXT));

		// Player dialogue text
		handleDialogueWidget(client.getWidget(ComponentID.DIALOG_PLAYER_TEXT));
	}

	private void handleDialogueWidget(Widget widget)
	{
		if (widget == null)
		{
			return;
		}

		String text = widget.getText();
		if (text == null || text.isEmpty())
		{
			return;
		}

		if (!text.equals(lastTextProcessed)) {
			String newText = text;
			for (Map.Entry<String, String> entry : PronunciationHelperDictionary.PRONUNCIATIONS.entrySet()) {
				String word = entry.getKey();
				String pronunciation = entry.getValue();

				// Replace full words only, not substrings inside other words
				newText = newText.replaceAll("\\b" + word + "\\b", word + "(" + pronunciation + ")");
			}

			if (!newText.equals(text)) {
				widget.setText(newText);
			}
			lastTextProcessed = newText;
		}

	}

	@Provides
	PronunciationHelperConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(PronunciationHelperConfig.class);
	}
}
