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
			description = "Color code for pronunciation hints",
			position = 1
	)
	default Color pronunciationColor()
	{
		return Color.YELLOW;
	}

	@ConfigItem(
			keyName = "translationHotkey",
			name = "Show only translation",
			description = "Hold this key to show only the translation instead of word(translation)",
			position = 2
	)
	default Keybind translationHotkey()
	{
		return Keybind.SHIFT;
	}
}

