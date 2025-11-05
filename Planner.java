import java.util.ArrayList;
import java.util.*;
import java.time.LocalDate;

public class Planner {
    public ArrayList<Assignment> assignments = new ArrayList<>();

    //Adding an assignment to the Array List
    public void addAssignment(Assignment assignment){
        System.out.println();
        assignments.add(assignment);
    }

    //Displaying all the assignments if there are any!!
    public void showAll(){
        if(assignments.isEmpty()){
            System.out.println("You haven't got any assignments right now!");
            return;
        }
        else {
            for (Assignment i : assignments){
                System.out.println(i);
            }
        }
    }

    //Marking an assignment as done but first checking if that's even an assignment there!
    public void markDone(String titleWanted){
        for(Assignment i : assignments) {
            if (i.title.equalsIgnoreCase(titleWanted)) {
                i.taskDone();
                System.out.println("Assignment marked as completed!");
            }
            else {
                System.out.println("Oh no! That assignment isn't in your list!");
            }
        }
    }

    public void sorting(){
        if(assignments.isEmpty()){
            System.out.println("No tasks yet!");
        }
        assignments.sort(Comparator.comparing(Assignment::getDueDate));
        for (Assignment i : assignments){
            System.out.println(i);
        }
    }
}
