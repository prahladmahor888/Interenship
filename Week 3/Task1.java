class Student{
    String studentName;
    int rollNumber;
    String branch;
    double cgpa;

    public Student(String studentName, int rollNumber, String branch, double cgpa){
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.cgpa = cgpa;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Student s1 = new Student("Johan Doe", 101, "CSE", 7.5);
        Student s2 = new Student("Rohan Verma", 102, "IT", 8.5);
        Student s3 = new Student("Prahlad", 103, "CSE", 6.9);

        System.out.println("\n---------------Student 1 Detail----------------\n");
        display(s1);
        System.out.println("\n---------------Student 2 Detail----------------\n");
        display(s2);
        System.out.println("\n---------------Student 3 Detail----------------\n");
        display(s3);
    }
    
    public static void display(Student s){
        System.out.println("Student Name : " + s.studentName);
        System.out.println("Roll Number : " + s.rollNumber);
        System.out.println("Branch : " + s.branch);
        System.out.println("CGPA : " + s.cgpa); 
    }
}
