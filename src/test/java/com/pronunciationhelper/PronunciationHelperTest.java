package com.pronunciationhelper;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PronunciationHelperTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PronunciationHelperPlugin.class);
		RuneLite.main(args);
	}
}