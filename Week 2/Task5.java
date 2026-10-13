import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, average = 0;
        int[] studentMarks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks of Student " + i + " : ");
            studentMarks[i] = sc.nextInt();
        }
        sc.close();
        int highest = studentMarks[0], lower = studentMarks[0];
        for (int i : studentMarks) {
            total += i;
            if(highest < i){
                highest = i;
            }
            if(lower > i){
                lower = i;
            }
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Average marks: " + (double) total/5);
        System.out.println("Highest marks: " + highest);
        System.out.println("Lowest marks: "+ lower);
    }
}
