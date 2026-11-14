import java.io.*;
import java.util.*;

public class StudentManager implements StudentOperations{
    private HashMap<Integer, Student> students = new HashMap<>();

    public StudentManager(){
        loadFromFile();
    }

    @Override
    public void addStudent(Student student){
        int id = student.getStudentId();
        if(!students.containsKey(id)) {
            students.put(id, student);
            System.out.println("Student added successfully");
            saveToFile();
        }else{
            System.out.println("Student already exists");
        }
    }

    @Override
    public void remove(int studentId) throws StudentNotFoundException {
        if(students.containsKey(studentId)) {
            students.remove(studentId);
            Student.decreaseTotalStudents();
            System.out.println("Student removed successfully");
            saveToFile();
        } else {
            throw new StudentNotFoundException("Error: Student with ID " + studentId + " doesn't exist!");
        }
    }

    @Override
    public void update(int id, String newName, String newCourse, int age, float newMarks){
        if(students.containsKey(id)){
            Student existingStudent = students.get(id);
            existingStudent.setName(newName);
            existingStudent.setCourse(newCourse);
            existingStudent.setAge(age);
            existingStudent.setMarks(newMarks);
            System.out.println("Student updated successfully");
            saveToFile();
        }else {
            System.out.println("Error: Student with ID " + id + " doesn't exist.");
        }
    }

    @Override
    public void search(String name){
        boolean isFound = false;
        for (Student student : students.values()) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student Found:");

                System.out.println(String.format("%-5s | %-20s | %-20s | %-5s | %-7s",
                        "ID", "Name", "Course", "Age", "Marks"));
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println(student);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("No student found with the name: " + name);
        }
    }

    @Override
    public void viewAll(){
        if (students.isEmpty()) {
            System.out.println("No student records found!");
            return;
        }
        System.out.println("Total Active Students: " + Student.getTotalStudents());
        System.out.println(String.format("%-5s | %-20s | %-20s | %-5s | %-7s",
                "ID", "Name", "Course", "Age", "Marks"));
        System.out.println("----------------------------------------------------------------------------------");

        for(Student student : students.values()){
            System.out.println(student.toString());
        }
    }

    @Override
    public void viewStudent(int id){
        Student student = students.get(id);
        if(student != null) {
            IO.println(String.format("%-5s | %-20s | %-20s | %-5s | %-7s",
                    "ID", "Name", "Course", "Age", "Marks"));
            System.out.println(student);
        }else{
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void viewUniqueCourses() {
        HashSet<String> uniqueCourses = new HashSet<>();
        for (Student student : students.values()) {
            uniqueCourses.add(student.getCourse());
        }

        System.out.println("\n--- List of Enrolled Courses ---");
        if (uniqueCourses.isEmpty()) {
            System.out.println("No courses found.");
        } else {
            for (String course : uniqueCourses) {
                System.out.println("- " + course);
            }
        }
    }

    public void viewStudentsSortedByMarks() {
        if (students.isEmpty()) {
            System.out.println("No student records found!");
            return;
        }

        ArrayList<Student> studentList = new ArrayList<>(students.values());
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Float.compare(s2.getMarks(), s1.getMarks());
            }
        });

        System.out.println("\n--- Students Ranked by Marks ---");
        System.out.println(String.format("%-5s | %-20s | %-20s | %-5s | %-7s", "ID", "Name", "Course", "Age", "Marks"));
        System.out.println("----------------------------------------------------------------------------------");
        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    private void loadFromFile() {
        File file = new File("students.txt");

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(", ");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String course = data[2];
                int age = Integer.parseInt(data[3]);
                float marks = Float.parseFloat(data[4]);
                Student student = new Student(name, course, age, marks);
                student.setStudentId(id);
                student.setCourse(course);
                student.setAge(age);
                student.setMarks(marks);
                students.put(id, student);
            }
            if (!students.isEmpty()) {
                int maxId = Collections.max(students.keySet());
                Student.setIdCounter(maxId);
                Student.setTotalStudents(students.size());
            }
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error formatting data from file.");
        }
    }

    public void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {

            for (Student student : students.values()) {
                String record = student.getStudentId() + ", " +
                        student.getName() + ", " +
                        student.getCourse() + ", " +
                        student.getAge() + ", " +
                        student.getMarks();

                writer.write(record);
                writer.newLine();
            }
            System.out.println("Data saved successfully in students.txt!");

        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

}
