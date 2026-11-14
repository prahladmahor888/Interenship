import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        int studentId;
        String studentName;
        String studentCourse;
        int studentAge;
        float studentMarks;
        do{
           System.out.println("1.  Add Student");
           System.out.println("2.  View All");
           System.out.println("3.  Search");
           System.out.println("4.  Update");
           System.out.println("5.  Delete");
           System.out.println("6.  View Unique Courses");
           System.out.println("7.  View Ranking by Marks");
           System.out.println("8.  Exit");
           System.out.print("Enter your choice : ");
           try {
               choice = input.nextInt();
               input.nextLine();
               switch(choice){
                   case 1:
                       System.out.print("Enter Student Name : ");
                       studentName = input.nextLine();
                       System.out.print("Enter Student Course : ");
                       studentCourse = input.nextLine();
                       System.out.print("Enter Student Age : ");
                       studentAge = input.nextInt();
                       System.out.print("Enter Student Marks : ");
                       studentMarks = input.nextFloat();
                       studentManager.addStudent(new Student(studentName, studentCourse, studentAge, studentMarks));
                       break;

                   case 2:
                       studentManager.viewAll();
                       break;

                   case 3:
                       System.out.print("Enter Student Name to Search : ");
                       studentName = input.nextLine();
                       studentManager.search(studentName);
                       break;

                   case 4:
                       System.out.print("Enter Student ID to update : ");
                       studentId = input.nextInt();
                       input.nextLine();
                       System.out.print("Enter New Student Name : ");
                       studentName = input.nextLine();

                       System.out.print("Enter New Student Course : ");
                       studentCourse = input.nextLine();

                       System.out.print("Enter New Student Age : ");
                       studentAge = input.nextInt();

                       System.out.print("Enter New Student Marks : ");
                       studentMarks = input.nextFloat();
                       studentManager.update(studentId, studentName, studentCourse, studentAge, studentMarks);
                       break;

                   case 5:
                       System.out.print("Enter Student ID to Remove : ");
                       try {
                           studentManager.remove(input.nextInt());
                       }catch (StudentNotFoundException e){
                           System.out.println(e.getMessage());
                       }
                       break;

                   case 6:
                       studentManager.viewUniqueCourses();
                       break;

                   case 7:
                       studentManager.viewStudentsSortedByMarks();
                       break;

                   case 8:
                       System.out.println("Bye");
                       break;

                   default:
                       System.out.println("Invalid Choice");
                       break;
               }
           }catch (InputMismatchException e){
               System.out.println("Invalid Input");
               input.nextLine();
           }
        }while(choice != 8);
        input.close();
    }
}

