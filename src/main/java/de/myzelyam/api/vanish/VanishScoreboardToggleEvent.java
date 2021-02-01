package de.myzelyam.api.vanish;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

/**
 * Called before a player toggles their scoreboard using /pv scoreboard
 * <p/>
 * The player isnt necessarily vanished
 */
public class VanishScoreboardToggleEvent extends PlayerEvent {

    private static final HandlerList handlers = new HandlerList();
    private final boolean newState;

    public VanishScoreboardToggleEvent(Player p, boolean newState) {
        super(p);
        this.newState = newState;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    /**
     * @return TRUE if the scoreboard will be turned on, FALSE otherwise
     */
    public boolean getNewState() {
        return newState;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
