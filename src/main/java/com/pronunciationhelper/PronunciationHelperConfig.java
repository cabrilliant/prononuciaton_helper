package com.pronunciationhelper;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;

import java.awt.*;

@ConfigGroup("PronunciationHelper")
public interface PronunciationHelperConfig extends Config
{
	@ConfigItem(
			keyName = "pronunciationColor",
			name = "Pronunciation Color",
			description = "Color for pronunciation hints",
			position = 1
	)
	default Color pronunciationColor()
	{
		return Color.YELLOW;
	}

	@ConfigItem(
			keyName = "alwaysShow",
			name = "Always Show pronunciation",
			description = "When enabled, will always show pronunciations regardless of pronunciation hotkey",
			position = 2
	)
	default boolean alwaysShow()
	{
		return false;
	}

	@ConfigItem(
			keyName = "pronunciationHotkey",
			name = "Show only pronunciation",
			description = "Hold this key to show only the pronunciation instead of word(pronunciation)",
			position = 3
	)
	default Keybind pronunciationHotkey()
	{
		return Keybind.SHIFT;

	}

	@ConfigItem(
			keyName = "showPronunciationHighlight",
			name = "Highlight Eligible Words",
			description = "When enabled, will highlight words that can have pronunciations shown",
			position = 4
	)
	default boolean showPronunciationHighlight()
	{
		return true;
	}

	@ConfigItem(
			keyName = "pronunciationHighlightColor",
			name = "Pronunciation Highlight Color",
			description = "Color to highlight words that have pronunciations available. Ignored if Always Show pronunciation is enabled, or if  Show Pronuncation Highlight is disabled.",
			position = 5
	)
	default Color pronunciationHighlightColor()
	{
		return Color.MAGENTA;
	}
}

