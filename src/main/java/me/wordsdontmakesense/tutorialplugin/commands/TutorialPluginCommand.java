package me.wordsdontmakesense.tutorialplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class TutorialPluginCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 1 && args[0].equalsIgnoreCase("help"))
        {
            sendHelpCommand(sender);
        } else {
            sender.sendMessage("");
            sender.sendMessage(ChatColor.GOLD + "Tutorial Plugin v1.0.0");
            sender.sendMessage(ChatColor.GOLD + "Created by WordsDontMakeSense");
            sender.sendMessage("");
        }
        return true;
    }

    public static void sendHelpCommand(CommandSender sender)
    {
        sender.sendMessage("");
        sender.sendMessage(ChatColor.GOLD + ChatColor.BOLD.toString() + "Tutorial Plugin Commands");
        sender.sendMessage(ChatColor.GOLD + "/tutorialplugin " + ChatColor.GRAY + "Displays plugin information!");
        sender.sendMessage(ChatColor.GOLD + "/tutorialplugin help " + ChatColor.GRAY + "Displays this help message!");
        sender.sendMessage(ChatColor.GOLD + "/nearestplayer " + ChatColor.GRAY + "Gets the nearest player to you!");
        sender.sendMessage(ChatColor.GOLD + "/distance (player1) " + ChatColor.GRAY + "Gets the distance between a player and you!");
        sender.sendMessage(ChatColor.GOLD + "/distance (player1) (player2) " + ChatColor.GRAY + "Gets the distance between two players!");
        sender.sendMessage("");
    }
}
