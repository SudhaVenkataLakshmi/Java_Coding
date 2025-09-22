class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(1001, "Sudha", 50000);
        Employee e2 = new Employee(1002, "Sushma", 65000);

        e1.display();
        e2.display();
    }
}

