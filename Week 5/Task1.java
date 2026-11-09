import studentmanagement.Student;
public class Task1 {
    public static void main(String[] args){
        Student student = new Student(100, "Prahalad", "CSE");
        Student student2 = new Student(101, "Sumit", "Ai-Ml");

        System.out.println("\n-------------------------Student information-----------------------------------");
        student.display();
        System.out.println("\n-------------------------Student 2 information----------------------------------");
        student2.display();
    }
}
