// class Student {
//     String name;
//     int age;
//     void display(){
//         System.out.println("Name: " +name);
//         System.out.println("Age: " +age);
//     }
// }

// public class OOPS{
//     public static void main(String[] args){
//         Student s1 = new Student();
//         s1.name = "Sudha";
//         s1.age = 21;
//         s1.display();
//     }
// }



class Car{
    String brand;
    String model;
    double price;
    void displayCar(){
        System.out.println("Car Brand: " +brand);
        System.out.println("Car Model: " +model);
        System.out.println("Car Price: " +price);
    }
}


public class OOPS {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.brand = "Toyoto";
        c1.model = "Innova";
        c1.price = 2000000;
        c1.displayCar();
    }
    
}