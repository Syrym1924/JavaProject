public class Main {
        public static void main(String[] args) {
        // Создаем обычную задачу
        Task task = new Task("Учеба", "Подготовиться к экзамену");
        task.printTask();

        System.out.println();

        // Создаем срочную задачу
        oop_project urgentTask = new oop_project("Сдать проект", "Завершить проект по Java", "10 февраля 2025");
        urgentTask.printTask();
    }
}
