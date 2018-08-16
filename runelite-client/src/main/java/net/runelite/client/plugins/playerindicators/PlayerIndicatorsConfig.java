/*
		 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
		 * All rights reserved.
		 *
		 * Redistribution and use in source and binary forms, with or without
		 * modification, are permitted provided that the following conditions are met:
		 *
		 * 1. Redistributions of source code must retain the above copyright notice, this
		 *    list of conditions and the following disclaimer.
		 * 2. Redistributions in binary form must reproduce the above copyright notice,
		 *    this list of conditions and the following disclaimer in the documentation
		 *    and/or other materials provided with the distribution.
		 *
		 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
		 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
		 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
		 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
		 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
		 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
		 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
		 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
		 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
		 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
		 */

package net.runelite.client.plugins.playerindicators;

import java.awt.Color;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("playerindicators")
public interface PlayerIndicatorsConfig extends Config
{
	@ConfigItem(
			position = 0,
			keyName = "drawOwnName",
			name = "Highlight own player",
			description = "Configures whether or not your own player should be highlighted"
	)
	default boolean highlightOwnPlayer()
	{
		return false;
	}

	@ConfigItem(
			position = 1,
			keyName = "ownNameColor",
			name = "Own player color",
			description = "Color of your own player"
	)
	default Color getOwnPlayerColor()
	{
		return new Color(0, 184, 212);
	}

	@ConfigItem(
			position = 2,
			keyName = "drawFriendNames",
			name = "Highlight friends",
			description = "Configures whether or not friends should be highlighted"
	)
	default boolean highlightOffline() {return true; }

	@ConfigItem(
			position = 3,
			keyName = "showFriendsPrivOff",
			name = "Show friends with private off",
			description = "Configures whether or not friends that have their private off should be highlighted"
	)
	default boolean highlightFriends()
	{
		return true;
	}

	@ConfigItem(
			position = 4,
			keyName = "friendNameColor",
			name = "Friend color",
			description = "Color of friend names"
	)
	default Color getFriendColor()
	{
		return new Color(0, 200, 83);
	}

	@ConfigItem(
			position = 5,
			keyName = "drawClanMemberNames",
			name = "Highlight clan members",
			description = "Configures whether or clan members should be highlighted"
	)
	default boolean drawClanMemberNames()
	{
		return true;
	}

	@ConfigItem(
			position = 6,
			keyName = "clanMemberColor",
			name = "Clan member color",
			description = "Color of clan members"
	)
	default Color getClanMemberColor()
	{
		return new Color(170, 0, 255);
	}

	@ConfigItem(
			position = 7,
			keyName = "drawTeamMemberNames",
			name = "Highlight team members",
			description = "Configures whether or not team members should be highlighted"
	)
	default boolean highlightTeamMembers()
	{
		return true;
	}

	@ConfigItem(
			position = 8,
			keyName = "teamMemberColor",
			name = "Team member color",
			description = "Color of team members"
	)
	default Color getTeamMemberColor()
	{
		return new Color(19, 110, 247);
	}

	@ConfigItem(
			position = 9,
			keyName = "drawNonClanMemberNames",
			name = "Highlight non-clan members",
			description = "Configures whether or not non-clan members should be highlighted"
	)
	default boolean highlightNonClanMembers()
	{
		return false;
	}

	@ConfigItem(
			position = 10,
			keyName = "nonClanMemberColor",
			name = "Non-clan member color",
			description = "Color of non-clan member names"
	)
	default Color getNonClanMemberColor()
	{
		return Color.RED;
	}

	@ConfigItem(
			position = 11,
			keyName = "drawPlayerTiles",
			name = "Draw tiles under players",
			description = "Configures whether or not tiles under highlighted players should be drawn"
	)
	default boolean drawTiles()
	{
		return false;
	}

	@ConfigItem(
			position = 12,
			keyName = "drawOverheadPlayerNames",
			name = "Draw names above players",
			description = "Configures whether or not player names should be drawn above players"
	)
	default boolean drawOverheadPlayerNames()
	{
		return true;
	}

	@ConfigItem(
			position = 13,
			keyName = "drawMinimapNames",
			name = "Draw names on minimap",
			description = "Configures whether or not minimap names for players with rendered names should be drawn"
	)
	default boolean drawMinimapNames()
	{
		return false;
	}

	@ConfigItem(
			position = 14,
			keyName = "colorPlayerMenu",
			name = "Colorize player menu",
			description = "Color right click menu for players"
	)
	default boolean colorPlayerMenu()
	{
		return true;
	}

	@ConfigItem(
			position = 15,
			keyName = "clanMenuIcons",
			name = "Show clan ranks",
			description = "Add clan rank to right click menu and next to player names"
	)
	default boolean showClanRanks()
	{
		return true;
	}

	@ConfigItem(
			position = 16,
			keyName = "callerList",
			name = "Paste RSN(s) of callers",
			description = "Import RSNs of callers to have them tracked on your friend finder"
	)
	default String highlightCallerList()
	{
		return "";
	}

	@ConfigItem(
			keyName = "callerList",
			name = "",
			description = ""
	)
	void highlightCallerList(String key);

	@ConfigItem(
			position = 17,
			keyName = "showCallerListScreen",
			name = "Display callers on the viewpoint",
			description = "Toggle whether or not callers should appear on the viewpoint"
	)
	default boolean callersOnScreen()
	{
		return true;
	}

	@ConfigItem(
			position = 18,
			keyName = "showCallerListMap",
			name = "Display callers on the minimap",
			description = "Toggle whether or not callers should appear on the minimap"
	)
	default boolean callersOnMap()
	{
		return true;
	}

	@ConfigItem(
			position = 19,
			keyName = "callerColor",
			name = "Caller color",
			description = "Color of callers"
	)
	default Color callerColor()
	{
		return new Color(19, 110, 247);
	}

	@ConfigItem(
			position = 20,
			keyName = "snipeList",
			name = "Paste RSN(s) of people to snipe",
			description = "Import RSNs of people to snipe to have them tracked on your friend finder"
	)
	default String highlightSnipeList()
	{
		return "";
	}

	@ConfigItem(
			position = 21,
			keyName = "showSnipeListScreen",
			name = "Display callers on the viewpoint",
			description = "Toggle whether or not people on the snipe list should appear on the viewpoint"
	)
	default boolean snipeOnScreen()
	{
		return true;
	}

	@ConfigItem(
			position = 22,
			keyName = "showSnipeListMap",
			name = "Display callers on the minimap",
			description = "Toggle whether or not people on the snipe list should appear on the minimap"
	)
	default boolean snipeOnMap()
	{
		return true;
	}

	@ConfigItem(
			position = 23,
			keyName = "snipeColor",
			name = "Snipe list color",
			description = "Color of people to snipe"
	)
	default Color snipeColor()
	{
		return new Color(0, 184, 212);
	}
}
