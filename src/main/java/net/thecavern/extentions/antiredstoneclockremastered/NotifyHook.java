package net.thecavern.extentions.antiredstoneclockremastered;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// This hook just stops the repeated update checks and telling players about updates :) ffs
public class NotifyHook {
    private static final List<UUID> notifiedPlayers = new ArrayList<>();

    public static Boolean announceUpdate(Player player) {
        if (!notifiedPlayers.contains(player.getUniqueId())) {
            notifiedPlayers.add(player.getUniqueId());
            return true;
        }
        return false;
    }

    public static void removePlayer(Player player) {
        notifiedPlayers.remove(player.getUniqueId());
    }
}
