package me.wordsdontmakesense.tutorialplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DistanceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("distance") && args.length != 0)
        {
            if(args.length == 1)
            {
                if(sender instanceof Player)
                {
                    Player player1 = (Player) sender;
                    Player player2 = Bukkit.getPlayer(args[0]);
                    if (player2 != null && Bukkit.getPlayer(sender.getName()).getWorld().getPlayers().contains(player2))
                    {
                        int distance = (int) player2.getLocation().distance(player1.getLocation());
                        sender.sendMessage(ChatColor.GOLD + player2.getName() + ChatColor.WHITE + " is " + ChatColor.GOLD + distance + ChatColor.WHITE + " blocks away from you!");
                    }
                } else {
                    sender.sendMessage(ChatColor.RED + "Incorrect Syntax! Only players can use this command format!");
                }
            } else if(args.length > 1)
            {
                Player player1 = Bukkit.getPlayer(args[0]);
                Player player2 = Bukkit.getPlayer(args[1]);
                if (player1 != null && player2 != null && player1.getWorld().getPlayers().contains(player2))
                {
                    int distance = (int) player2.getLocation().distance(player1.getLocation());
                    sender.sendMessage(ChatColor.GOLD + player1.getName() + ChatColor.WHITE + " is " + ChatColor.GOLD + distance + ChatColor.WHITE + " blocks away from " + ChatColor.GOLD + player2.getName() + ChatColor.WHITE + "!");
                }
            }
        }
        return true;
    }
}

// Gets the distance between you and quakton
// /distance quakton

// Gets the distance between WordsDontMakeSense and quakton
// /distance WordsDontMakeSense quakton

// /command sub0 sub1 sub2