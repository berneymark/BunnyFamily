package com.berneymark.bunnyfamily;

import com.berneymark.bunnyfamily.events.OnDeath;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class BunnyFamily extends JavaPlugin implements Listener {
    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent e) {
        Player player = e.getPlayer();
        player.sendMessage("Sweet dreams!");
    }

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent e) {
        e.setCancelled(true);
        e.getPlayer().sendMessage(ChatColor.GREEN + "Nice try!");
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Running...");
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new OnDeath(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Shutting down...");
    }
}
