package net.thecavern.extentions.antiredstoneclockremastered;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class ListenerHook implements Listener {
    @EventHandler
    private void onPlayerJoinEvent(PlayerQuitEvent playerQuitEvent) {
        NotifyHook.removePlayer(playerQuitEvent.getPlayer());
    }
}
