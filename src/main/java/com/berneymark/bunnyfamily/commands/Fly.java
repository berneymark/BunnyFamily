package com.berneymark.bunnyfamily.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Fly implements CommandExecutor {
    private ArrayList<Player> flyList = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("bunnyfamily.fly")) {
                if (flyList.contains(player)) {
                    player.setAllowFlight(false);
                    player.sendMessage("You have disabled flight.");
                } else {
                    player.setAllowFlight(true);
                    flyList.add(player);
                    player.sendMessage("You have enabled flight.");
                }
            }
        }

        return false;
    }
}
