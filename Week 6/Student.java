import java.util.Random;

public class Student{
    private int studentId;
    private String name;
    private String course;
    private int age;
    private float marks;
    private static int totalStudents = 0;
    private static int idCounter = 100;

    public Student(String name, String course, int age, float marks){
        idCounter++;
        this.studentId = idCounter;
        this.name = name;
        this.course = course;
        this.age = age;
        this.marks = marks;
        totalStudents++;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Student.idCounter = idCounter;
    }

    public static void decreaseTotalStudents() {
        if(totalStudents > 0) {
            totalStudents--;
        }
    }
    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void setTotalStudents(int totalStudents) {
        Student.totalStudents = totalStudents;
    }

    @Override
    public String toString() {
        return String.format("%-5d | %-20s | %-20s | %-5d | %-7.2f",
                studentId, name, course, age, marks);
    }
}