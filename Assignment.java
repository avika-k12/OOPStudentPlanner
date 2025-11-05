import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Assignment {
    //The attributes
    public String title;
    public String info;
    private LocalDate dueDate;
    public boolean isDone;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    //The constructor
    public Assignment(String title, String info, String dueDateString){
        this.title = title;
        this.info = info;
        this.dueDate = LocalDate.parse(dueDateString, FORMATTER);
        this.isDone = false;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    //If assignment done
    public void taskDone(){
        this.isDone = true;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + info + "\nDue Date: " + dueDate.format(FORMATTER) + "\nCompleted: " + (isDone ? "[✓]" : "[]") + "\n---------------------";
    }
}
