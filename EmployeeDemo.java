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
        Employee e1 = new Employee(4001, "Sandhya", 55000);
        Employee e2 = new Employee(4002, "Sudha", 82000);

        e1.display();
        e2.display();
    }
}

