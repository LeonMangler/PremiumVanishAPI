package de.myzelyam.api.vanish;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

/**
 * <p>API for PremiumVanish on Bukkit</p>
 * <p>This is to be used as a dependency and doesn't include the actual implementation</p>
 * <p><b>Please don't add this to your plugin jar, the real API comes with PremiumVanish!</b></p>
 */
public class VanishAPI {

    /**
     * @return A list of the UUIDs of all online vanished players
     */
    public static List<UUID> getInvisiblePlayers() {
        // ...
        return null;
    }

    /**
     * @return A list of the UUIDs of all vanished players, both online and offline players
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
     * Checks if a player is invisible, online or not
     * <p/>
     * Deprecated: Will cause minor lag if mysql is enabled, use asynchronously or sparingly
     *
     * @param uuid - the player's UUID.
     * @return TRUE if the player is invisible, FALSE otherwise.
     */
    public static boolean isInvisibleOffline(UUID uuid) {
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

    /**
     * Checks if a player has both their vanish scoreboard toggled on and permission to see it. The vanish
     * scoreboard will only show up if the specified player is also vanished.
     *
     * @param player the player
     * @return TRUE if the vanish scoreboard is toggled on and the player has permission to see it
     */
    public static boolean isScoreboardEnabled(Player player) {
        // ...
        return false;
    }

    /**
     * Checks if PremiumVanish is currently displaying its vanish scoreboard to a player.
     *
     * @param player the player
     * @return TRUE if PremiumVanish is currently displaying its vanish scoreboard to the player
     */
    public static boolean isScoreboardShown(Player player) {
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

    static {
        Bukkit.getLogger().severe("[PremiumVanish] A plugin has wrongfully loaded the PremiumVanishAPI dependency! " +
                "Its developer must not add it to their plugin jar. The actual API comes with PremiumVanish! The API won't work.");
    }
}
