import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        // Initial data
        students.add("Ram");
        students.add("Rohan");
        students.add("Radhika");
        students.add("Arti");
        students.add("Prahlad");

        display(students);
        int choice;
        
        do {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Search student");
            System.out.println("4. Display students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name to add: ");
                    students.add(sc.next());
                    System.out.println("Student added successfully.");
                    break;
                    
                case 2:
                    System.out.println("\nWhich student do you want to remove?");
                    display(students);
                    System.out.print("Enter name: ");
                    String removeName = sc.next();
                    
                    // .remove() returns a boolean, so we can check if it worked
                    if (students.remove(removeName)) {
                        System.out.println(removeName + " removed successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to find: ");
                    String find = sc.next();
                    
                    // Simplified search using ArrayList's built-in indexOf method
                    int index = students.indexOf(find);
                    if (index != -1) {
                        System.out.println(find + " is present at index " + index);
                    } else {
                        System.out.println(find + " is not present in this list.");
                    }
                    break; 

                case 4:
                    display(students);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        } while (choice != 5);
        
        sc.close(); 
    }

    public static void display(ArrayList<String> students) {
        System.out.println("\n------------------- Students -------------------");
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            for (String student : students) {
                System.out.println("- " + student);
            }
        }
        System.out.println("------------------------------------------------");
    }
}