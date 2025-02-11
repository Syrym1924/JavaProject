public class Task {
    private String title;
    private String description;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    //Setter
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void printTask() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
    }
}
