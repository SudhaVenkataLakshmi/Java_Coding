interface Shape {
    double area();
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(12, 5);

        System.out.println("Circle area is: " + circle.area());
        System.out.println("Rectangle area is: " + rectangle.area());
    }
}

