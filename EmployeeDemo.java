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
        Employee emp1 = new Employee(3001, "Sandhya", 70000);
        Employee emp2 = new Employee(3002, "Sushma", 62000);

        emp1.display();
        emp2.display();
    }
}

