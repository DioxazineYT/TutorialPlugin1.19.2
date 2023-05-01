package me.wordsdontmakesense.tutorialplugin;

import me.wordsdontmakesense.tutorialplugin.commands.NearestCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class TutorialPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "Tutorial Plugin" + ChatColor.WHITE + ": " + ChatColor.GREEN + "Enabled!");
        //getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[TutorialPlugin]: Enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "Tutorial Plugin" + ChatColor.WHITE + ": " + ChatColor.RED + "Disabled!");
        //getServer().getConsoleSender().sendMessage(ChatColor.RED + "[TutorialPlugin]: Disabled!");
    }
}
