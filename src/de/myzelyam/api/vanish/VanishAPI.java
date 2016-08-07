package de.myzelyam.api.vanish;

import de.myzelyam.premiumvanish.main.PremiumVanish;
import de.myzelyam.premiumvanish.main.utilities.Validation;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/**
 * API for PremiumVanish on Bukkit
 * Method content is redacted
 * */
public class VanishAPI {

    /**
     * @return A list of strings which represent the UUIDs of all online hidden players
     */
    public static List<String> getInvisiblePlayers() {
        // ...
        return null;
    }

    /**
     * @return A list of the UUIDs of all hidden players, online or offline
     * <p/>
     * Deprecated: Will cause minor lag if mysql is enabled, use asynchronously or sparingly
     */
    @Deprecated
    public static List<UUID> getAllInvisiblePlayers() {
        // ...
        return null;
    }

    /**
     * Player must be online for this to return true if MySQL is enabled
     *
     * @param p - the player.
     * @return TRUE if the player is invisible, FALSE otherwise.
     */
    public static boolean isInvisible(Player p) {
        // ...
        return false;
    }

    /**
     * Hides a player using PremiumVanish
     *
     * @param p - the player.
     */
    public static void hidePlayer(Player p) {
        // ...
    }

    /**
     * * Shows a player using PremiumVanish
     *
     * @param p - the player.
     */
    public static void showPlayer(Player p) {
        // ...
    }

    /**
     * * Checks if a player is allowed to see another player
     *
     * @param viewer - the viewer
     * @param viewed - the viewed player
     * @return TRUE if viewed is not vanished or viewer has the permission to see viewed
     */
    public static boolean canSee(Player viewer, Player viewed) {
        // ...
        return false;
    }

    public static FileConfiguration getConfiguration() {
        // ...
        return null;
    }

    public static FileConfiguration getMessages() {
        // ...
        return null;
    }

    public static FileConfiguration getPlayerData() {
        // ...
        return null;
    }

    public static void reloadConfig() {
        // ...
    }
}
