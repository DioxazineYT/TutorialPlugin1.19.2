package me.wordsdontmakesense.tutorialplugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedMainHandEvent;

public class MainHandChange implements Listener {
    @EventHandler
    public void onMainHandChange(PlayerChangedMainHandEvent event)
    {
        event.getPlayer().sendMessage("You are now holding " + event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName());
    }
}
