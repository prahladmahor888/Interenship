import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name: ");
        String studentName = sc.nextLine();
        System.out.println("Enter Marks of Math: ");
        int mathMarks = sc.nextInt();
        System.out.println("Enter Marks of Science: ");
        int scienceMarks = sc.nextInt();
        System.out.println("Enter Marks of Chemistry: ");
        int chemistryMarks = sc.nextInt();

        int totalMarks = mathMarks + scienceMarks + chemistryMarks;

        double persantage = (totalMarks * 100) / 300;
        System.out.println("Student detail");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Persantage: " + persantage);
        System.out.println("Result: ");
        if((35 <= persantage) || (50 > persantage)){
            System.out.print("Grade D");
        } else if(50 <= persantage || 60 > persantage){
            System.out.print("Grade C");
        } else if(60 <= persantage || 75 > persantage){
            System.out.print("Grade b");
        }else if(75 <= persantage || 90 > persantage){
            System.out.print("Grade A");
        } else if(90 <= persantage || 100 > persantage){
            System.out.print("Grade A+");
        }
        else{
            System.out.print("Fail");
        }

        sc.close();
    }
}
