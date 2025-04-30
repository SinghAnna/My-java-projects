package ToDo;


import java.util.ArrayList;
import java.util.Scanner;

public class To_do_List {

         static ArrayList<String> todoTask = new ArrayList<>();
         static Scanner scanner = new Scanner(System.in);



    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- TODO LIST ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice){
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> removeTask();
                case 4 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while ( choice != 4);
    }

    public static void addTask(){
        System.out.print("Enter the Task. :- ");
        String task = scanner.nextLine();
        todoTask.add(task);
        System.out.println("Task added Success Fully...");
    }

    static void viewTasks(){
         if (todoTask.isEmpty()){
             System.out.println("Nothing is Here. It is Empty..");
         }else {
             System.out.println("\n ----- Your Task ----- ");
             for (int i = 0; i < todoTask.size(); i++){
                 System.out.println((i+1) + ". "+todoTask.get(i));
             }
         }
    }

    static void removeTask(){
         viewTasks();
         if (!todoTask.isEmpty()){
             System.out.print("Enter the Task Number to remove : ");
             int index = scanner.nextInt();
             scanner.nextLine();  // consume newline
             if (index > 0 && index <= todoTask.size()){
                 todoTask.remove(index-1);
                 System.out.println("Task was success fully removed.");
             }else{
                 System.out.println("Something Wrong.");
             }
         }
    }





}
