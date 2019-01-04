package de.myzelyam.api.vanish;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class VanishTargetChangeEvent extends PlayerEvent {

    private static final HandlerList handlers = new HandlerList();
    private final Player newTarget, previousTarget;

    public VanishTargetChangeEvent(Player p, Player newTarget, Player previousTarget) {
        super(p);
        this.newTarget = newTarget;
        this.previousTarget = previousTarget;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * @return The new target of the player's scoreboard or null if the target has been removed
     */
    public Player getNewTarget() {
        return newTarget;
    }

    /**
     * @return The previous target of the player's scoreboard or null if there was no target
     */
    public Player getPreviousTarget() {
        return previousTarget;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
