package com.discordlevelnotifications;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("discordlevelnotifications")
public interface LevelNotificationsConfig extends Config
{
	@ConfigItem(
			keyName = "webhook",
			name = "Webhook URL",
			description = "The Discord Webhook URL to send messages to."
	)
	String webhook();

	@ConfigItem(
			keyName = "sendScreenshot",
			name = "Send Screenshot",
			description = "Include a screenshot when leveling up."
	)
	default boolean sendScreenshot()
	{
		return false;
	}

	@ConfigItem(
			keyName = "minimumLevel",
			name = "Minimum level",
			description = "Levels greater than or equal to this value will send a message."
	)
	default int minLevel()
	{
		return 0;
	}

	@ConfigItem(
			keyName = "levelInterval",
			name = "Send every X levels",
			description = "Only levels that are a multiple of this value are sent. Level 99 will always be sent regardless of this value."
	)
	default int levelInterval() { return 1; }
}
