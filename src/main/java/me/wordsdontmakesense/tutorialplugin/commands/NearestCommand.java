package me.wordsdontmakesense.tutorialplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NearestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player)
        {
            Player player = (Player) sender;
            // https://bukkit.org/threads/get-the-nearest-player.142143/ @lenis0012
            Player nearestPlayer = null;
            double farthestDistance = Double.MAX_VALUE;
            for (Player p : player.getWorld().getPlayers()) {
                if (player == p)
                    continue;

                double distance = player.getLocation().distance(p.getLocation());
                if (distance < farthestDistance) {
                    farthestDistance = distance;
                    nearestPlayer = p;
                }
            }

            if (nearestPlayer != null && player.getWorld().getPlayers().size() > 1) {
                sender.sendMessage("The nearest player to you is " + nearestPlayer.getName() + "! They are " + Math.round(farthestDistance) + " blocks away from you!");
            } else {
                sender.sendMessage(ChatColor.RED + "You are alone in this world!");
            }
        }
        return true;
    }
}