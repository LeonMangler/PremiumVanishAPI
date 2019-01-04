package de.myzelyam.api.vanish;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;

public class PostPlayerHideEvent extends PlayerEvent {

    private static final HandlerList handlers = new HandlerList();
    private final boolean silent;

    public PostPlayerHideEvent(Player p, boolean silent) {
        super(p);
        this.silent = silent;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public boolean isSilent() {
        return silent;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
