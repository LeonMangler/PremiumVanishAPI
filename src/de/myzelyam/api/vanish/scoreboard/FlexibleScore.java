package de.myzelyam.api.vanish.scoreboard;

/**
 * A score for a {@link ScoreboardModule}
 */
public class FlexibleScore {
    private final String content;
    private final String uniqueContent;

    /**
     * Creates a new score with the specified content and unique content
     *
     * @param content       - The content of the new score, e.g. "Health: 12"
     * @param uniqueContent - A unique content that is *always* contained in content, e.g. "Health: "
     */
    public FlexibleScore(String content, String uniqueContent) {
        this.content = content.length() > 32 ? content.substring(0, 32) : content;
        this.uniqueContent = uniqueContent;
    }

    public String getContent() {
        return content;
    }

    public String getUniqueContent() {
        return uniqueContent;
    }
}
