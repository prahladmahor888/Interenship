package  studentmanagement;

public class Student{
    private int studentId;
    private String studentName;
    private String course;

    public Student(int studentId, String studentName, String course){
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }

    public void display(){
        System.out.println("-Sudent ID " + studentId);
        System.out.println("-Sudent Name : " + studentName);
        System.out.println("-course : " + course);
        System.out.println("\n");

    }
}