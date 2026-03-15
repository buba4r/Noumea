package ai;

/**
 * Enumeration of available Claude (Anthropic) Sonnet models.
 * These models can be used for AI-assisted WPS workflow generation and code assistance.
 */
public enum ClaudeModel {

    CLAUDE_SONNET_4_5("claude-sonnet-4-5", "Claude Sonnet 4.5"),
    CLAUDE_3_5_SONNET("claude-3-5-sonnet-20241022", "Claude 3.5 Sonnet"),
    CLAUDE_3_SONNET("claude-3-sonnet-20240229", "Claude 3 Sonnet");

    private final String modelId;
    private final String displayName;

    ClaudeModel(String modelId, String displayName) {
        this.modelId = modelId;
        this.displayName = displayName;
    }

    public String getModelId() {
        return modelId;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
