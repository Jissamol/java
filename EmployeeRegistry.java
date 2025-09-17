class Employee {

    private int empId;
    private String name;
    private double salary;


    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }


    public void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }


    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }
}
public class EmployeeRegistry {


    public static void update(Employee emp, double newSalary) {
        emp.updateSalary(newSalary);
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new Employee(101, "Alice", 50000.0);
        employees[1] = new Employee(102, "Bob", 60000.0);
        employees[2] = new Employee(103, "Charlie", 55000.0); 


        for (int i = 0; i < 2; i++) {
            employees[i].displayEmployee();
        }

        System.out.println("After Salary Update:");
        update(employees[0], 55000.0);
        employees[0].displayEmployee();
    }
}
