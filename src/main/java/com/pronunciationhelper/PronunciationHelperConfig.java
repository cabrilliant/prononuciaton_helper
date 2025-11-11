package com.pronunciationhelper;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

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
}
