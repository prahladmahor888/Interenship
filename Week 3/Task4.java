class Employee {
    String name;
    int employeeId;
    double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int empId, double salary, String programmingLanguage) {
        super(name, empId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int empId, double salary, int teamSize) {
        super(name, empId, salary);
        this.teamSize = teamSize;
    }

    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting with a team of " + teamSize + " members.");
    }
}

public class Task4 {
    public static void main(String[] args) {
        Developer developer = new Developer("Prahalad", 1000, 49500.0, "Java");
        Manager manager = new Manager("Rohan", 156468574, 100335.0, 10);

        // Developer Output
        System.out.println("========== Developer Details ==========");
        displayEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.programmingLanguage);
        developer.writeCode(); 

        System.out.println();

        // Manager Output
        System.out.println("=========== Manager Details ===========");
        displayEmployeeDetails(manager);
        System.out.println("Team Size           : " + manager.teamSize);
        manager.conductMeeting();
    }

    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Name       : " + employee.name);
        System.out.println("Employee ID         : " + employee.employeeId);
        System.out.println("Employee Salary     : " + employee.salary);
    }
}