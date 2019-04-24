package com.berneymark.bunnyfamily;

import com.berneymark.bunnyfamily.events.OnDeath;
import com.berneymark.bunnyfamily.events.OnPlayerJoin;
import com.berneymark.bunnyfamily.events.OnPlayerLeave;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class BunnyFamily extends JavaPlugin implements Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("workbench")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.openWorkbench(player.getLocation(), true);
            }
        } else sender.sendMessage("You don't need a workbench!");

        return false;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Running...");

        getServer().getPluginManager().registerEvents(this, this);
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
