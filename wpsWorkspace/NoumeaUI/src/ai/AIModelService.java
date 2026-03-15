package ai;

/**
 * Service for managing the selected Claude AI model configuration.
 * Provides a singleton to store and retrieve the currently selected model.
 */
public class AIModelService {

    private static final AIModelService instance = new AIModelService();

    private ClaudeModel selectedModel = ClaudeModel.CLAUDE_SONNET_4_5;

    private AIModelService() {
    }

    public static AIModelService getInstance() {
        return instance;
    }

    public ClaudeModel getSelectedModel() {
        return selectedModel;
    }

    public void setSelectedModel(ClaudeModel model) {
        if (model == null) {
            throw new IllegalArgumentException("Model must not be null");
        }
        this.selectedModel = model;
    }

    public String getSelectedModelId() {
        return selectedModel.getModelId();
    }
}
