package com.berneymark.bunnyfamily.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Murder implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (args.length == 0) {
                player.sendMessage("You have just killed yourself.");
                player.setHealth(0);
            } else if (args.length == 1) {
                Player target = Bukkit.getPlayer(args[0]);

                if (target instanceof Player) {
                    target.setHealth(0);
                    target.sendMessage("You were murdered by " + player.getDisplayName() + ".");
                }

                player.sendMessage("Target " + args[0] + " has been murdered.");
            } else player.sendMessage("Usage: /murder <username>");
        }
        
        return false;
    }
}
