// This is free and unencumbered software released into the public domain.
// Author: NotAlexNoyle.
package plugin;

// Import libraries.
import com.destroystokyo.paper.event.player.PlayerAdvancementCriterionGrantEvent;
import org.bukkit.GameMode;
// Hook into Bukkit's Listener.
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class Listeners implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onAdvancementProgress(PlayerAdvancementCriterionGrantEvent event) {
        if (event.getPlayer().getGameMode() != GameMode.SURVIVAL) {
            event.setCancelled(true);
        }
    }
}
