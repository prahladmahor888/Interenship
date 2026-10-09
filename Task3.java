import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your full name: ");
        String fullName = s.nextLine();
        System.out.print("Enter your Age: ");
        int age = s.nextInt();
        s.nextLine();
        System.out.print("Enter your College Name: ");
        String college = s.nextLine();
        System.out.print("Enter your Branch: ");
        String branch = s.next();
        System.out.print("Enter your City: ");
        String city = s.next();

        s.close();

        System.out.println("────────────────Student Details───────────────────");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("College Name: " + college);
        System.out.println("Branch: " + branch);
        System.out.println("City: " + city);
        System.out.println("────────────────────────────────────────────────────");

    }
}
