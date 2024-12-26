import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Перечисление уровней сложности
enum DifficultyLevel {
    EASY, MEDIUM, HARD;

    // Метод для получения времени решения задачи
    public int getEstimatedTime() {
        switch (this) {
            case EASY:
                return 30; // В минутах
            case MEDIUM:
                return 60; // В минутах
            case HARD:
                return 120; // В минутах
            default:
                throw new IllegalArgumentException("Unknown difficulty level");
        }
    }
}