import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        
        int choice = 0;

        while (choice != 6) {
            System.out.println("\n--- TO-DO LIST MENU ---");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Remove a task");
            System.out.println("5. Clear all tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the task description: ");
                    String newTask = scanner.nextLine();
                    tasks.add(newTask);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- CURRENT TASKS ---");
                    if (tasks.isEmpty()) {
                        System.out.println("Your to-do list is empty.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to update.");
                    } else {
                        System.out.print("Enter the number of the task to update: ");
                        int updateIndex = scanner.nextInt() - 1;
                        scanner.nextLine();
                        
                        if (updateIndex >= 0 && updateIndex < tasks.size()) {
                            System.out.print("Enter the new task description: ");
                            String updatedTask = scanner.nextLine();
                            tasks.set(updateIndex, updatedTask);
                            System.out.println("Task updated successfully!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        System.out.print("Enter the number of the task to remove: ");
                        int removeIndex = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (removeIndex >= 0 && removeIndex < tasks.size()) {
                            tasks.remove(removeIndex);
                            System.out.println("Task removed successfully!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 5:
                    tasks.clear();
                    System.out.println("All tasks cleared!");
                    break;

                case 6:
                    System.out.println("Exiting TodoManager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 6.");
            }
        }
        
        scanner.close();
    }
}