class Employee{
    int employeeId;
    String employeeName;
    String department;
    double salary;

    public Employee(){}
    public Employee(int employeeId, String employeeName, String department, double salary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
    }
}

public class Task2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.employeeId = 1001;
        employee1.employeeName = "Prahlad Mahour";
        employee1.department = "IT Head";
        employee1.salary = 75000;

        Employee employee2 = new Employee(1002, "Mohan Das", "CSE", 50000);

        System.out.println("-----------------Employee 1 information-----------------\n");
        display(employee1);

        System.out.println("-----------------Employee 2 information-----------------\n");
        display(employee2);
    }

    public static void display(Employee employee){
        System.out.println("Employee Id : " + employee.employeeId);
        System.out.println("Employee Name : " + employee.employeeName);
        System.out.println("Department : " + employee.department);
        System.out.println("Salary : " + employee.salary); 
    }
}
