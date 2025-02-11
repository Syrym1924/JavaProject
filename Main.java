import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        // Устанавливаем UTF-8 для вывода в консоль
        try {
            System.setOut(new PrintStream(System.out, true, "UTF-8"));
        } catch (Exception e) {
            System.out.println("Ошибка установки кодировки UTF-8");
        }

        // Создаем обычную задачу
        Task task = new Task("Учеба", "Подготовиться к экзамену");
        task.printTask();

        System.out.println();

        // Создаем срочную задачу
        oop_project urgentTask = new oop_project("Сдать проект", "Завершить проект по Java", "10 февраля 2025");
        urgentTask.printTask();
    }
}
