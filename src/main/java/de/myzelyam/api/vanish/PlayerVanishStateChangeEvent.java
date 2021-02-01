package de.myzelyam.api.vanish;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import javax.annotation.Nullable;
import java.util.UUID;

public class PlayerVanishStateChangeEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final boolean vanishing;
    private final UUID uuid;
    private final String name;
    @Nullable
    private final String cause;

    private boolean isCancelled = false;

    public PlayerVanishStateChangeEvent(UUID uuid, String name, boolean vanishing, @Nullable String cause) {
        this.vanishing = vanishing;
        this.uuid = uuid;
        this.name = name;
        this.cause = cause;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    /**
     * Cancels the operation, it's recommended to send a message to the cause
     */
    @Override
    public void setCancelled(boolean cancel) {
        isCancelled = cancel;
    }

    /**
     * @return TRUE if the player is vanishing, FALSE if the player is reappearing
     */
    public boolean isVanishing() {
        return vanishing;
    }

    /**
     * @return The name of the player who is vanishing/reappearing
     */
    public String getName() {
        return name;
    }

    /**
     * @return The UUID of the player who is vanishing/reappearing
     */
    public UUID getUUID() {
        return uuid;
    }

    /**
     * @return The name of the command sender who caused the vanish state change or null if the cause is
     * either not specified or it's PremiumVanish itself, please note that if this returns 'CONSOLE' then it's
     * the console which caused this state change
     */
    @Nullable
    public String getCause() {
        return cause;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
