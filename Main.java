import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Planner planner = new Planner();

        //Setting up the planner
        System.out.print("What is your name?");
        String name = scanner.nextLine();

        //Main menu that keeps looping until student wants to exit
        while (true){
            System.out.println();
            System.out.println("--" + name + "'s Planner--");
            System.out.println("Main Menu:");
            System.out.println("1. Add Assignment");
            System.out.println("2. View Assignments");
            System.out.println("3. View Assignments (sorted by due date)");
            System.out.println("4. Mark Assignment as done");
            System.out.println("5. Exit your planner");
            System.out.print("Choose what you would like to do: ");

            int choice = scanner.nextInt();

            scanner.nextLine();

            //Switch case based on option chosen by user
            switch(choice){
                case 1:
                    System.out.println("Enter title of assignment: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter some information about your assignment: ");
                    String info = scanner.nextLine();
                    System.out.println("Enter the due date of you assignment (dd-mm-yyyy): ");
                    String dueDate = scanner.nextLine();
                    planner.addAssignment(new Assignment(title, info, dueDate));
                    break;
                case 2:
                    planner.showAll();
                    break;
                case 3:
                    planner.sorting();
                    break;
                case 4:
                    System.out.print("Enter the title of the task you want to mark as done: ");
                    String titleToSearch = scanner.nextLine();
                    planner.markDone(titleToSearch);
                    break;
                case 5:
                    System.out.println("Thanks for visiting your student planner " + name + "!");
                    System.out.println("Until next time!");
                    scanner.close();
                    return;
                default:
                    System.out.println("That wasn't an option!");
            }

        }
    }
}
