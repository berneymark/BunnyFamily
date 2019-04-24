package com.berneymark.bunnyfamily;

import org.bukkit.plugin.java.JavaPlugin;

public final class BunnyFamily extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Running...");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Shutting down...");
    }
}
