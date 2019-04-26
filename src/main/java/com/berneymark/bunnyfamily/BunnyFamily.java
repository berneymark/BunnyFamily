package com.berneymark.bunnyfamily;

import com.berneymark.bunnyfamily.commands.*;
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

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(new OnDeath(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerLeave(), this);

        getCommand("god").setExecutor(new God());
        getCommand("craft").setExecutor(new CraftingTable());
        getCommand("heal").setExecutor(new Heal());
        getCommand("feed").setExecutor(new Feed());
        getCommand("print").setExecutor(new Print());
        getCommand("sendword").setExecutor(new SendWord());
        getCommand("murder").setExecutor(new Murder());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Shutting down...");
    }
}
