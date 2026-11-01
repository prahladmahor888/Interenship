import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(10001, "Prahalad");
        students.put(10002, "Rohan");
        students.put(10003, "Shyam");
        students.put(10004, "Diya");
        students.put(10005, "Mukesh");
        students.put(10006, "Vinay");
        dispay(students);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key which record you want to search : ");
        int record = sc.nextInt();
        if (students.containsKey(record)) {
            System.out.println("Student name : " + students.get(record));            
        }else{
            System.out.println("This record not present");
        }

        System.out.print("Enter Student id Which Student record you want to delete : ");
        record = sc.nextInt();
        if (students.containsKey(record)) {
            students.remove(record);
            System.out.println("\nStudent recode deleted successfuly");
        }

        System.out.println("Afer deleted students record");
        dispay(students);

    }

    public static void dispay(HashMap<Integer, String> students){
        System.out.println("Studnet Id              |   Studnet Name");
        System.out.println("------------------------------------------");
        for(Map.Entry<Integer, String> entry: students.entrySet()){
            System.out.println(entry.getKey() + "                   |   " + entry.getValue());
        }
    }
}
