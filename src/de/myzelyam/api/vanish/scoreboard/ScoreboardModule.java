package de.myzelyam.api.vanish.scoreboard;

import org.bukkit.entity.Player;

/**
 * A scoreboard module for the scoreboard which shows up for vanished players
 */
public abstract class ScoreboardModule {

    private final boolean requiresTarget;
    private final String id;

    /**
     * @param id             - A unique name for your module
     * @param requiresTarget - If this is true the scoreboard module won't show up in the scoreboard if there
     *                       is no target however {@link #getScore(Player, Player)}'s target is also
     *                       guaranteed to not be null
     */
    public ScoreboardModule(String id, boolean requiresTarget) {
        this.id = id;
        this.requiresTarget = requiresTarget;
    }

    /**
     * Creates a new {@link FlexibleScore} with up-to-date information
     *
     * @param target   - The target of the scoreboard or null if there is no target
     * @param vanished - The vanished player the scoreboard is being displayed to
     * @return An updated version of the score
     */
    public abstract FlexibleScore getScore(Player target, Player vanished);

    public boolean requiresTarget() {
        return requiresTarget;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ScoreboardModule)) return false;
        ScoreboardModule that = (ScoreboardModule) o;
        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
