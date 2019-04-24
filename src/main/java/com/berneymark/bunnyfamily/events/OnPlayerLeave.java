package com.berneymark.bunnyfamily.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnPlayerLeave implements Listener {
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e) {
        String playerName = e.getPlayer().getDisplayName();
        e.setQuitMessage("Sad to see you leave, " + playerName + "!");
    }
}
