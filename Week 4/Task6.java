import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

class Student{
    int id;
    String name;
    String course;
    int age;
    public Student(int id, String name, String course, int age){
        this.id = id;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCourse(){
        return course;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name)
        .append("\t\t| ")
        .append(course)
        .append("\t\t| ")
        .append(age);
        return sb.toString();
    }
}

class StudentManager{
    HashMap<Integer, Student> studentMap = new HashMap<>();
    public void addStudent(){
        int id = 0;
        String name;
        String course;
        int age = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student id : ");
        try {
            String idString = sc.next();
            id = Integer.parseInt(idString);
            
        } catch (NumberFormatException e) {
            System.out.println("Please Enter id in numbers : ");
            return;
        }        

        System.out.print("Enter student Name : ");
        name = sc.next();

        System.out.print("Enter student course : ");
        course = sc.next();

        System.out.print("Enter student Age : ");        
        try {
            String studentAge = sc.next();
            age = Integer.parseInt(studentAge);
            
        } catch (NumberFormatException e) {
            System.out.println("Enter age in numbers");
            return;
        }
        if (!studentMap.containsKey(id)) {
            Student student = new Student(id, name, course, age);
            studentMap.put(id, student);
            System.out.println("Student added Successfully");
        }else{
            System.out.println("This student id already contain");
        }
        
    }

    public void searchStudent(int id) {
        if (studentMap.containsKey(id)) {
            Student s = studentMap.get(id); 
            System.out.println("Student Found: " + s); 
        } else {
            System.out.println("Student does not exist!");
        }
    }

    public void removeStudent(int id){
        if (studentMap.containsKey(id)) {
            studentMap.remove(id);
            System.out.println("Student is removed successfully");
        }else{
            System.out.println("Student not found");
        }
    }

    public void displayUniqueCourses() {
        if (studentMap.isEmpty()) {
            System.out.println("No students found. Add students to see unique courses.");
            return;
        }

        HashSet<String> uniqueCourses = new HashSet<>();

        for (Student student : studentMap.values()) {
            uniqueCourses.add(student.getCourse());
        }

        System.out.println("------------------------------------------");
        System.out.println("Unique Courses Offered:");
        System.out.println("------------------------------------------");
        
        for (String course : uniqueCourses) {
            System.out.println("- " + course);
        }
        System.out.println("------------------------------------------");
    }

    public void display() {
        if(studentMap.isEmpty()){
            System.out.println("No students found in the record.");
            return;
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("Student ID\t| Student Name\t\t| Course\t| Age");
        System.out.println("------------------------------------------------------------------");
        
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + "\t\t| " + entry.getValue());
        }
        System.out.println("------------------------------------------------------------------");
    }
}

public class Task6 {    
    public static void main(String[] args) {
        StudentManager student = new StudentManager();
        Scanner sc = new Scanner(System.in);

        int choise;
        do{
            System.out.println("\n\n===== Student Record Manager =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Display Unique Courses");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choise = sc.nextInt();
            try {
                switch (choise) {
                    case 1:
                        student.addStudent();
                        break;

                    case 2:
                        student.display();
                        break;

                    case 3:
                        System.out.print("Enter Student id : ");
                        int studentId = sc.nextInt();
                        student.searchStudent(studentId);
                        break;

                    case 4:
                        System.out.println("Enter Student id to remove : ");
                        int id = sc.nextInt();
                        student.removeStudent(id);
                        break;

                    case 5:
                        student.displayUniqueCourses();
                        break;

                    case 6:
                        break;
                
                    default:
                        System.out.println("Invelid Choise");
                }
            } catch (InputMismatchException e) {
               System.out.println("Enter choise in number");
               sc.nextLine();
            }
        }while(choise != 6);

        sc.close();
    }    
}
