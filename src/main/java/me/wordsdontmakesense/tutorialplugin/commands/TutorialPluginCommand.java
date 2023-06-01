package me.wordsdontmakesense.tutorialplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TutorialPluginCommand implements CommandExecutor, TabExecutor {

    private static final String[] args0 = {"info", "help"};

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 1)
        {
            if(args[0].equalsIgnoreCase("help"))
            {
                sendHelpCommand(sender);
            } else if(args[0].equalsIgnoreCase("info"))
            {
                sendInfoCommand(sender);
            }
        } else {
            sendInfoCommand(sender);
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        final List<String> completions = new ArrayList<>();
        StringUtil.copyPartialMatches(args[0], Arrays.asList(args0), completions);
        Collections.sort(completions);
        return completions;
    }

    public static void sendInfoCommand(CommandSender sender)
    {
        sender.sendMessage("");
        sender.sendMessage(ChatColor.GOLD + "Tutorial Plugin v1.0.0");
        sender.sendMessage(ChatColor.GOLD + "Created by WordsDontMakeSense");
        sender.sendMessage("");
    }

    public static void sendHelpCommand(CommandSender sender)
    {
        sender.sendMessage("");
        sender.sendMessage(ChatColor.GOLD + ChatColor.BOLD.toString() + "Tutorial Plugin Commands");
        sender.sendMessage(ChatColor.GOLD + "/tutorialplugin info " + ChatColor.GRAY + "Displays plugin information!");
        sender.sendMessage(ChatColor.GOLD + "/tutorialplugin help " + ChatColor.GRAY + "Displays this help message!");
        sender.sendMessage(ChatColor.GOLD + "/nearestplayer " + ChatColor.GRAY + "Gets the nearest player to you!");
        sender.sendMessage(ChatColor.GOLD + "/distance (player1) " + ChatColor.GRAY + "Gets the distance between a player and you!");
        sender.sendMessage(ChatColor.GOLD + "/distance (player1) (player2) " + ChatColor.GRAY + "Gets the distance between two players!");
        sender.sendMessage("");
    }
}

// /tutorialplugin help - send help command
// /tutorialplugin info - send info command
// /tutorialplugin - send info command