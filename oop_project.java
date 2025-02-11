public class UrgentTask extends Task {
    private String deadline;

    // Конструктор
    public UrgentTask(String title, String description, String deadline) {
        super(title, description);
        this.deadline = deadline;
    }

    // Геттер
    public String getDeadline() {
        return deadline;
    }
    
    @Override
    public void printTask() {
        super.printTask();
        System.out.println("Deadline: " + deadline);
    }
}
