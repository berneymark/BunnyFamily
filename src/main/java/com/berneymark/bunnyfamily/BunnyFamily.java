package com.berneymark.bunnyfamily;

import com.berneymark.bunnyfamily.commands.*;
import com.berneymark.bunnyfamily.events.OnDeath;
import com.berneymark.bunnyfamily.events.OnPlayerJoin;
import com.berneymark.bunnyfamily.events.OnPlayerLeave;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

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
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Shutting down...");
    }
}
