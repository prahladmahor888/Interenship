# Student Management System

This project is a Java-based console application developed as part of the Week 6 internship assignment. It helps in managing student records efficiently using a menu-driven interface.

## Project Description

The Student Management System allows users to:
- Add new student records
- View all students
- Search a student by name
- Update existing student details
- Delete a student record
- Store data in a file for future use

This project was built to apply Java concepts like OOP, collections, exception handling, and file handling in a real-world scenario.

## Features

- Add Student
- View All Students
- Search Student by Name
- Update Student Details
- Delete Student
- Exit the application
- Data persistence using `students.txt`
- Input validation and custom exception handling

## Project Structure

```text
Interenship/
├── Week 6/
│   ├── Main.java
│   ├── Student.java
│   ├── StudentManager.java
│   ├── StudentOperations.java
│   ├── StudentNotFoundException.java
│   ├── students.txt
│   └── out/
├── README.md
└── Week 1 to Week 5 practice files
```

## Technologies Used

- Java
- Java Collections (HashMap)
- File Handling
- Exception Handling
- Console Input/Output
- Object-Oriented Programming (OOP)

## Java Concepts Used

- Classes and Objects
- Constructors
- Encapsulation
- Static variables/methods
- Inheritance (where applicable in project design)
- Exception handling with try-catch
- File reading and writing
- Collections for storing student data
- Menu-driven program logic

## How to Run

1. Open terminal or command prompt.
2. Go to the `Week 6` folder.
3. Compile the project:

```bash
javac *.java
```

4. Run the application:

```bash
java Main
```

## Menu Options

```text
1. Add Student
2. View All
3. Search
4. Update
5. Delete
6. Exit
```

## Sample Output

```text
1.  Add Student
2.  View All
3.  Search
4.  Update
5.  Delete
6.  Exit
Enter your choice : 1
Enter Student Name : Prahlad
Enter Student Course : CSE
Enter Student Age : 20
Enter Student Marks : 88.5
Student added successfully
```

## Future Improvements

- Add login and admin panel
- Add sorting by marks or age
- Add search by student ID
- Add GUI version using Swing or JavaFX
- Add database integration (MySQL)

## Conclusion

This project helped me understand how Java can be used to build a complete management application. It strengthened my understanding of object-oriented programming, data management, and console-based application development.

## Author

Prahlad Mahor
