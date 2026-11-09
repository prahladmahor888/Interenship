import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        String fileName = "students_records.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Student ID: 101\n");
            writer.write("Student Name: Amit Kumar\n");
            writer.write("Course: Computer Science\n");
            writer.write("Marks: 88.5\n");
            writer.write("----------------------------\n");
            
            writer.write("Student ID: 102\n");
            writer.write("Student Name: Priya Sharma\n");
            writer.write("Course: Information Technology\n");
            writer.write("Marks: 92.0\n");
            writer.write("----------------------------\n");

            System.out.println("Success: Student records successfully written to '" + fileName + "'.\n");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Reading contents of '" + fileName + "':\n");
            
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}