package me.wordsdontmakesense.tutorialplugin.events;

import org.bukkit.entity.Chicken;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;

public class EggThrown implements Listener {
    @EventHandler
    public void onEggThrown(PlayerEggThrowEvent event)
    {
        if(event instanceof Chicken) {
            event.setNumHatches((byte) 10);
            event.setHatching(true);
            event.setHatchingType(EntityType.CHICKEN);
        }
    }
}
