class Student {
    String name;
    int rollNo;
    double marks;
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks  : " + marks);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Maha", 508, 85.0);
        Student s2 = new Student("Bhumi", 509, 72.5);
        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
    }
}
