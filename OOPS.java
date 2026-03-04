class Student {
    String name;
    int age;
    void display(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
    }
}

public class OOPS{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Sudha";
        s1.age = 21;
        s1.display();
    }
}
