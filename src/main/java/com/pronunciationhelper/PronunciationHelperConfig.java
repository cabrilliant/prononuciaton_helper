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
		return true;
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
}

