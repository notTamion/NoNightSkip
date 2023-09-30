package de.tamion.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.TimeSkipEvent;

public class TimeSkipListener implements Listener {
    @EventHandler
    public void onTimeSkip(TimeSkipEvent e) {
        if(e.getSkipReason().name().equals("NIGHT_SKIP")) {
            e.setCancelled(true);
        }
    }
}
