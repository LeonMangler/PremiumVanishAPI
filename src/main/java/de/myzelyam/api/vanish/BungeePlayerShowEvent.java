package de.myzelyam.api.vanish;

import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Event;

/**
 * Called when an online player reappears
 */
public class BungeePlayerShowEvent extends Event {

    private final ProxiedPlayer player;

    public BungeePlayerShowEvent(ProxiedPlayer player) {
        this.player = player;
    }

    /**
     * @return The player who is reappearing
     */
    public ProxiedPlayer getPlayer() {
        return player;
    }
}
