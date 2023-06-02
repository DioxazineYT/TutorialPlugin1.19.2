package me.wordsdontmakesense.tutorialplugin;

import me.wordsdontmakesense.tutorialplugin.commands.DistanceCommand;
import me.wordsdontmakesense.tutorialplugin.commands.NearestCommand;
import me.wordsdontmakesense.tutorialplugin.commands.TutorialPluginCommand;
import me.wordsdontmakesense.tutorialplugin.events.EggThrown;
import me.wordsdontmakesense.tutorialplugin.events.MainHandChange;
import org.bukkit.ChatColor;
import org.bukkit.entity.Egg;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TutorialPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "Tutorial Plugin" + ChatColor.WHITE + ": " + ChatColor.GREEN + "Enabled!");
        //getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[TutorialPlugin]: Enabled!");

        // Commands
        getCommand("tutorialplugin").setExecutor(new TutorialPluginCommand());
        getCommand("nearestplayer").setExecutor(new NearestCommand());
        getCommand("distance").setExecutor(new DistanceCommand());

        // Tab Complete
        getCommand("tutorialplugin").setTabCompleter(new TutorialPluginCommand());

        // Listeners
        getServer().getPluginManager().registerEvents(new EggThrown(), this);
        getServer().getPluginManager().registerEvents(new MainHandChange(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "Tutorial Plugin" + ChatColor.WHITE + ": " + ChatColor.RED + "Disabled!");
        //getServer().getConsoleSender().sendMessage(ChatColor.RED + "[TutorialPlugin]: Disabled!");
    }
}
