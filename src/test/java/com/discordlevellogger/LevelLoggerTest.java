package com.discordlevellogger;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class LevelLoggerTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(LevelLoggerPlugin.class);
		RuneLite.main(args);
	}
}