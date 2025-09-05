import java.util.*;

class Employee implements Comparable<Employee> {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return name + " - " + salary;
    }
}

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Alice", 70000));
        employees.add(new Employee("Bob", 40000));

        Collections.sort(employees); // Sort by salary
        employees.forEach(System.out::println);
    }
}

