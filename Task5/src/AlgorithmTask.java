class AlgorithmTask {
    private String name;
    private DifficultyLevel difficulty;

    public AlgorithmTask(String name, DifficultyLevel difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    public String getName() {
        return name;
    }

    public DifficultyLevel getDifficulty() {
        return difficulty;
    }

    @Override
    public String toString() {
        return String.format("Task: %s, Difficulty: %s, Estimated Time: %d mins",
                name, difficulty, difficulty.getEstimatedTime());
    }
}
