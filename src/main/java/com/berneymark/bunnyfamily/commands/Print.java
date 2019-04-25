package com.berneymark.bunnyfamily.commands;

import com.berneymark.bunnyfamily.BunnyFamily;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Print implements CommandExecutor {
    Plugin plugin = BunnyFamily.getPlugin(BunnyFamily.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        int num = plugin.getConfig().getInt("Number");
        player.sendMessage("" + num);

        return false;
    }
}
