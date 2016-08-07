package de.myzelyam.api.vanish;

import net.md_5.bungee.api.connection.ProxiedPlayer;

import java.util.List;
import java.util.UUID;

/**
 * API for PremiumVanish on BungeeCord
 * Method content is redacted
 */
public class BungeeVanishAPI {

    /**
     * @return A list of the UUIDs of all online hidden players
     */
    public static List<UUID> getInvisiblePlayers() {
        // ...
        return null;
    }

    /**
     * @return A list of the UUIDs of all hidden players, online or offline
     * <p/>
     * Deprecated: Will cause minor lag, use asynchronously or sparingly
     */
    @Deprecated
    public static List<UUID> getAllInvisiblePlayers() {
        // ...
        return null;
    }

    /**
     * @param p - the player.
     * @return TRUE if the player is invisible and online, FALSE otherwise.
     */
    public static boolean isInvisible(ProxiedPlayer p) {
        // ...
        return false;
    }

    /**
     * Makes the player's server hide the player
     *
     * @param p - the player.
     */
    public static void hidePlayer(ProxiedPlayer p) {
        // ...
    }

    /**
     * Makes the player's server show the player
     *
     * @param p - the player.
     */
    public static void showPlayer(ProxiedPlayer p) {
        // ...
    }
}
