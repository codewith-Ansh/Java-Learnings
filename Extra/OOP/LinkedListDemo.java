import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " : " + salary;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee(1, "Ansh", 95000));
        employees.add(new Employee(2, "Vraj", 87000));
        employees.add(new Employee(3, "Dhaval", 91000));
        employees.addFirst(new Employee(0, "Karan", 99000));
        employees.addLast(new Employee(4, "Manan", 88000));

        System.out.println("Employees List:");
        for (Employee e : employees)
            System.out.println(e);

        employees.removeFirst();
        employees.removeLast();
        employees.removeIf(e -> e.salary < 90000);

        System.out.println("\nAfter Removals:");
        for (Employee e : employees)
            System.out.println(e);

        System.out.println("\nFirst Employee: " + employees.getFirst());
        System.out.println("Last Employee: " + employees.getLast());

        System.out.println("\nQueue Operations:");
        employees.offer(new Employee(5, "Rohan", 96000));
        System.out.println("Polled: " + employees.poll());
        System.out.println("After polling: " + employees);

        System.out.println("\nStack Operations:");
        employees.push(new Employee(6, "Mihir", 98000));
        System.out.println("Popped: " + employees.pop());
        System.out.println("After pop: " + employees);

        employees.sort((a, b) -> Double.compare(b.salary, a.salary));

        System.out.println("\nSorted by Salary (Descending):");
        for (Employee e : employees)
            System.out.println(e);

        System.out.println("\nReverse Traversal:");
        Iterator<Employee> rev = employees.descendingIterator();
        while (rev.hasNext())
            System.out.println(rev.next());
    }
}
