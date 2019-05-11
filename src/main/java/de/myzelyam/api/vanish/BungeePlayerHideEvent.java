package de.myzelyam.api.vanish;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Event;

/**
 * Called when an online player vanishes
 */
public class BungeePlayerHideEvent extends Event {

    private final ProxiedPlayer player;

    public BungeePlayerHideEvent(ProxiedPlayer player) {
        this.player = player;
    }

    /**
     * @return The player who is vanishing
     */
    public ProxiedPlayer getPlayer() {
        return player;
    }
}
