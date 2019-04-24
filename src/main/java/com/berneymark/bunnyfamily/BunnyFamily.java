package com.berneymark.bunnyfamily;

import com.berneymark.bunnyfamily.events.OnDeath;
import com.berneymark.bunnyfamily.events.OnPlayerJoin;
import com.berneymark.bunnyfamily.events.OnPlayerLeave;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BunnyFamily extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Running...");

        getServer().getPluginManager().registerEvents(new OnDeath(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerLeave(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Shutting down...");
    }
}
