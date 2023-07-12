// Shape superclass
abstract class Shape {
    public abstract double calculateArea();
}

// Rectangle subclass
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Triangle subclass
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

// ShapeCalculator class
class ShapeCalculator {
    public void printArea(Shape shape) {
        double area = shape.calculateArea();
        System.out.println("Area: " + area);
    }
}

// Main class to demonstrate polymorphism
public class Q2 {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        Shape rectangle = new Rectangle(5, 10);
        calculator.printArea(rectangle); // Output: Area: 50.0

        Shape circle = new Circle(3);
        calculator.printArea(circle); // Output: Area: 28.274333882308138

        Shape triangle = new Triangle(4, 6);
        calculator.printArea(triangle); // Output: Area: 12.0
    }
}
