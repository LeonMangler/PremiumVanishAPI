package de.myzelyam.api.vanish;

import com.velocitypowered.api.proxy.Player;

/**
 * Called when an online player reappears
 */
public class VelocityPlayerShowEvent {

    private final Player player;

    public VelocityPlayerShowEvent(Player player) {
        this.player = player;
    }

    /**
     * @return The player who is reappearing
     */
    public Player getPlayer() {
        return player;
    }
}
