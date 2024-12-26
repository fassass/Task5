import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskDatabaseApp {
    private List<AlgorithmTask> tasks;

    public TaskDatabaseApp() {
        tasks = new ArrayList<>();
    }

    // Метод для добавления задачи
    public void addTask(String name, DifficultyLevel difficulty) {
        tasks.add(new AlgorithmTask(name, difficulty));
    }

    // Метод для вывода всех задач
    public void displayAllTasks() {
        tasks.forEach(System.out::println);
    }

    // Метод для фильтрации задач по уровню сложности
    public void filterTasksByDifficulty(DifficultyLevel difficulty) {
        List<AlgorithmTask> filteredTasks = tasks.stream()
                .filter(task -> task.getDifficulty() == difficulty)
                .collect(Collectors.toList());
        filteredTasks.forEach(System.out::println);
    }

    // Метод для сортировки задач по уровню сложности
    public void sortTasksByDifficulty() {
        tasks.sort(Comparator.comparing(AlgorithmTask::getDifficulty));
        System.out.println("Tasks sorted by difficulty:");
        displayAllTasks();
    }

    // Точка входа в приложение
    public static void main(String[] args) {
        TaskDatabaseApp app = new TaskDatabaseApp();

        // Добавление задач
        app.addTask("Binary Search", DifficultyLevel.EASY);
        app.addTask("Dynamic Programming", DifficultyLevel.HARD);
        app.addTask("Sorting Algorithms", DifficultyLevel.MEDIUM);
        app.addTask("Graph Traversal", DifficultyLevel.HARD);
        app.addTask("Recursion Basics", DifficultyLevel.EASY);

        // Вывод всех задач
        System.out.println("All Tasks:");
        app.displayAllTasks();

        // Фильтрация задач по уровню сложности
        System.out.println("\nFiltered Tasks (MEDIUM):");
        app.filterTasksByDifficulty(DifficultyLevel.MEDIUM);

        // Сортировка задач по уровню сложности
        System.out.println("\nSorting Tasks by Difficulty:");
        app.sortTasksByDifficulty();
    }
}