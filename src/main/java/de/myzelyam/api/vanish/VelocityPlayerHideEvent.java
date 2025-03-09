package de.myzelyam.api.vanish;

import com.velocitypowered.api.proxy.Player;

/**
 * Called when an online player vanishes
 */
public class VelocityPlayerHideEvent {

    private final Player player;

    public VelocityPlayerHideEvent(Player player) {
        this.player = player;
    }

    /**
     * @return The player who is vanishing
     */
    public Player getPlayer() {
        return player;
    }
}
