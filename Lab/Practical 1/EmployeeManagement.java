/* Problem Definition: Employee Management System using Class
Fundamentals and Constructors
Design a simple Employee Management System to model employees in a
company. Each employee should have attributes like ID, name, department,
and salary. Use appropriate access modifiers to ensure encapsulation.
Implement default and parameterized constructors, and demonstrate
constructor overloading. Track the number of employees created using a static
variable and showcase the use of the this keyword and this() constructor
chaining. Use instanceof to check object types during runtime when dealing
with contract vs. permanent employees. */

class Employee {
    private String name, department, id;
    private double salary;
    static int countEmployee = 0;

    Employee() {
        System.out.println("Object constructed successfully!");

    }

    Employee(String name, String id, String department) {
        this.name = name;
        this.department = department;
        this.id = id;

    }

    Employee(String name, String id, String department, double salary) {
        this(name, id, department);
        this.salary = salary;
        countEmployee++;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Department: " + department);
        System.out.println("Employee Salary: " + salary);
        System.out.println("-------------------------");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ansh", "22", "CE", 80000);
        Employee e2 = new Employee("Jash", "29", "EC", 90000);
        Employee e3 = new Employee("Tirth", "77", "CSE", 95000);
        Employee e4 = new Employee("Krrish", "48", "IT", 750000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
        e4.displayDetails();

        System.out.println("Number of Employe: " + Employee.countEmployee);
    }
}