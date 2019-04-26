package com.berneymark.bunnyfamily.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Vault implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Inventory vault = Bukkit.createInventory(player, 18, player.getDisplayName() + "'s Vault");

            ItemStack item1 = new ItemStack(Material.ACACIA_BOAT, 5);
            vault.setItem(1, item1);
            vault.clear();

            player.openInventory(vault);
        } else System.out.println("Sorry, you need to be a player to execute this command.");

        return false;
    }
}
