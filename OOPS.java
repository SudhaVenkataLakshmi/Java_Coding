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



// class Car{
//     String brand;
//     String model;
//     double price;
//     void displayCar(){
//         System.out.println("Car Brand: " +brand);
//         System.out.println("Car Model: " +model);
//         System.out.println("Car Price: " +price);
//     }
// }


// public class OOPS {
//     public static void main(String[] args){
//         Car c1 = new Car();
//         Car c2 = new Car();

//         c1.brand = "Toyoto";
//         c1.model = "Innova";
//         c1.price = 2000000;
//         c1.displayCar();

//         c2.brand = "Hyundai";
//         c2.model = "Creta";
//         c2.price = 1800000;
//         c2.displayCar();
//     }
    
// }



// class Student {
//     String name;
//     int age;
//     Student(){
//         name = "Sudha";
//         age = 23;
//     }
//     void display(){
//         System.out.println(name);
//         System.out.println(age);
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.display();
//     }
    
// }

// class Student{
//     String name;
//     int age;
// Student(String n, int a){
//     name = n;
//     age = a;
// }
// void display(){
//     System.out.println(name + " with age: " +age);
// }
// }
// public class OOPS {
//     public static void main(String[] args){
//         Student s1 = new Student("Sudha", 25);
//         Student s2 = new Student("Sushma",22);
//         s1.display();
//         s2.display();
//     }
    
// }



// class Car{
//     String brand;
//     String model;
//     int price;
//     Car(String b, String m, int p){
//         brand = b;
//         model = m;
//         price = p;
//     }
//     void displayCar(){
//         System.out.println("Car Brand: " +brand);
//         System.out.println("Car Model: " +model);
//         System.out.println("Car Price: " +price);
//     }
// }
// public class OOPS {

//     public static void main(String[] args){
//         Car c1 = new Car("Toyoto", "Innova",1200000);
//         Car c2 = new Car("Hyundai", "Creta", 1000000);
//         c1.displayCar();
//         c2.displayCar();
//     }
// }

// class Car{
//     String brand;
//     String model;
//     int price;
//     Car(String brand, String model, int price){
//         this.brand = brand;
//         this.model = model;
//         this.price = price;
//     }
//     void displayCar(){
//         System.out.println("Brand: " +brand);
//         System.out.println("Model: " +model);
//         System.out.println("Price: " +price);
//         System.out.println();
//     }
// }
// public class OOPS {

//     public static void main(String[] args) {
//         Car c1 = new Car("Toyoto","Innova",2800000);
//         Car c2 = new Car("Hyundai","Cretaa",1500000);
//         c1.displayCar();
//         c2.displayCar();
//     }
// }

// class Student{
//     String name;
//     int age;
//     double marks;
//     Student(String name, int age, double marks){
//         this.name = name;
//         this.age = age;
//         this.marks = marks;
//     }
//     void studentDetails(){
//         System.out.println("Student Name: " +name);
//         System.out.println("Age: " +age);
//         System.out.println("Marks Gained: " +marks);
//         System.out.println();
//     }
// }
// public class OOPS {

//     public static void main(String[] args) {
//         Student s1 = new Student("Mahaa", 24, 75);
//         Student s2 = new Student("Bhumika",21,82);
//         s1.studentDetails();
//         s2.studentDetails();
//     }
// }





// class MathOperations{
//     int add(int a, int b){
//         return a + b;
//     }
//     int add(int a, int b, int c){
//         return a + b + c;
//     }
// }
// public class OOPS {

//     public static void main(String[] args) {
//         MathOperations obj = new MathOperations();
//         System.out.println(obj.add(30,10));
//         System.out.println(obj.add(100,30));
//     }
// }


// class Display{
//     void show(int a){
//         System.out.println("Integer: " +a);
//     }
//     void show(String str){
//         System.out.println("String: " +str);
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         Display obj = new Display();
//         obj.show(10);
//         obj.show("Hello");
//     }
// }




// class CalculatorClass{
//     int multiply(int a, int b){
//         return a * b;
//     }
//     int multiply(int a, int b, int c){
//         return a * b * c;
//     }
//     double multiply(double a, double b){
//         return a * b;
//     }
// }
// public class OOPS {

//     public static void main(String[] args) {
//         CalculatorClass obj = new CalculatorClass();
//         System.out.println(obj.multiply(10, 4));
//         System.out.println(obj.multiply(20,50, 2));
//         System.out.println(obj.multiply(12.5,18.5));
//     }
// }




//Inheritance


// class Animal{
//     void eat() {
//         System.out.println("Animal is Eating.");
//     }
// }
// class Dog extends Animal{
//     void bark() {
//         System.out.println("Dog is Barking");
//     }
// }
// public class OOPS {

//     public static void main(String[] args) {
//         Dog d1 = new Dog(); 
//         d1.eat();
//         d1.bark();
//     }
// }




// class Person {
//     void name(String n) {
//         System.out.println(n+ ", How are you?");
//     }
//     void age(int a) {
//         System.out.println("Your age is: " +a);
//     }
// }
// class Student extends Person {
//     void marks(int m) {
//         System.out.println("Marks gained: " +m);
//     }
// }

// public class OOPS {

//     public static void main(String[] args) {
//         Student s = new Student();
//         s.name("Sushma");
//         s.age(21);
//         s.marks(95);
//     }
// }


class Parent {
    void show() {
        System.out.println("Heyyy Man!");
    }
}
class Child extends Parent {
    void show() {
        System.out.println("How are you?");
    }
}
public class OOPS {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.show();
        ch.show();
    }
}



// class Animal {
//     void sound() {
//         System.out.println("Animal walks rudely");
//     }
// }
// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog Barks on people");
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.sound();
//     }
// }


// class Person {
//     void work() {
//         System.out.println("Person Walks");
//     }
// }
// class Student extends Person {
//     void work() {
//         System.out.println("Student studies");
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.work();
//     }
// }


// class Vehicle {
//     void start() {
//         System.out.println("Vehicle Starts earlier");
//     }
// }
// class Car extends Vehicle {
//     void start() {
//         System.out.println("Car starts with new Key");
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         Vehicle v = new Vehicle();
//         v.start();
//         Car c = new Car();
//         c.start();
//     }
// }



// class Vehicle {
//     void start() {
//         System.out.println("Vehicle Starts at 9 PM");
//     }
// }
// class Car extends Vehicle {
//     void start() {
//         System.out.println("Car starts with Key");
//     }
// }
// public class OOPS {
//     public static void main(String[] args) {
//         Vehicle v1 = new Vehicle();
//         v1.start();
//         Vehicle v2 = new Car();
//         v2.start();
//     }
// }




// super keyword

// class Person {
//     String name = "Heyy";
// }
// class Student extends Person {
//     String name = "Sudhaaaa";
//     void display() {
//         System.out.println(name);
//         System.out.println(super.name);
//     }
// }
// public class OOPS {

//     public static void main(String[] args) {
//         Student s = new Student();
//         s.display();
//     }
// }


