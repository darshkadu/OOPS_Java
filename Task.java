import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String description;

    Task(String description) {
        this.description = description;
    }

    void display() {
        System.out.println(description);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Task\n2. Remove Task\n3. View Tasks\n4. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();  // Clear the buffer

            if (option == 1) {
                System.out.print("Enter task description: ");
                String description = sc.nextLine();
                tasks.add(new Task(description));
            } else if (option == 2) {
                System.out.print("Enter task number to remove: ");
                int taskNumber = sc.nextInt();
                if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                    tasks.remove(taskNumber - 1);
                } else {
                    System.out.println("Invalid task number.");
                }
            } else if (option == 3) {
                System.out.println("--- To-Do List ---");
                for (int i = 0; i < tasks.size(); i++) {
                    System.out.print((i + 1) + ". ");
                    tasks.get(i).display();
                }
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }
}
