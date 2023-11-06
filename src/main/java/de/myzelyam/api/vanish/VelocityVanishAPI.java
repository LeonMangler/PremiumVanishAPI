package de.myzelyam.api.vanish;

import com.velocitypowered.api.proxy.Player;

import java.util.List;
import java.util.UUID;

/**
 * <p>API for PremiumVanish on Velocity</p>
 * <p>This is to be used as a dependency and doesn't include the actual implementation</p>
 * <p><b>Please don't add this to your plugin jar. The real API comes with PremiumVanish!</b></p>
 */
public class VelocityVanishAPI {

    /**
     * @return A collection of the UUIDs of all online hidden players
     */
    public static List<UUID> getInvisiblePlayers() {
        // ...
        return null;
    }

    /**
     * @return A collection of the UUIDs of all hidden players, online or offline
     * <p/>
     * Deprecated: Will cause minor lag, use asynchronously or sparingly
     */
    @Deprecated
    public static List<UUID> getAllInvisiblePlayers() {
        // ...
        return null;
    }

    /**
     * @param player - the player.
     * @return TRUE if the player is invisible and online, FALSE otherwise.
     */
    public static boolean isInvisible(Player player) {
        // ...
        return false;
    }

    /**
     * Gets a player's use vanish permission level
     *
     * @param player the player
     */
    public static int getLayeredUsePermissionLevel(Player player) {
        // ...
        return -1;
    }

    /**
     * Gets a player's see vanish permission level
     *
     * @param player the player
     */
    public static int getLayeredSeePermissionLevel(Player player) {
        // ...
        return -1;
    }

    /**
     * Checks if a player is allowed to see another player
     *
     * @param viewer the viewer
     * @param viewed the viewed player
     * @return TRUE if viewed is not vanished or viewer has the permission to see viewed
     */
    public static boolean canSee(Player viewer, Player viewed) {
        // ...
        return false;
    }

    static {
        System.err.println("[PremiumVanish] A plugin has wrongfully loaded the PremiumVanishAPI dependency! " +
                "Its developer must not add it to their plugin jar. The actual API comes with PremiumVanish! The API won't work.");
    }
}