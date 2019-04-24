package com.berneymark.bunnyfamily.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        String playerName = e.getPlayer().getDisplayName();
        e.setJoinMessage("Welcome back to the server, " + playerName + "!");
    }
}
