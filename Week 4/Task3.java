import java.util.HashSet;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        HashSet<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("C");
        courses.add("C++");
        courses.add("JavaScript");
        courses.add("PHP");
        courses.add("HTML");
        courses.add("Python");
        display(courses);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cource that you want to search : ");
        String element = sc.next();
        int index = 0;
        boolean find = false;
        for (String elemeString : courses) {
            if(elemeString.equals(element)){
                find = true;
                break;
            }
            index++;
        }
        sc.close();

        if (find) {
            System.out.println("Cource found at index : " + index);
        }else{
            System.out.println("Course not present in this set");
        }
    }

    public static void display(HashSet<String> cousers){
        System.out.println("\n-----------Courses---------------\n");
        for (String elementeString : cousers) {
            System.out.println("-- " + elementeString);
        }
    }
}
