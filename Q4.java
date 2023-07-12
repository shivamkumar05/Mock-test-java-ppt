// Drawable interface
interface Drawable {
    void draw();
}

// Circle class implementing Drawable
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Rectangle class implementing Drawable
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// Main program
public class Q4 {
    public static void main(String[] args) {
        // Create objects of Circle and Rectangle
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        // Call the draw() method on each object
        circle.draw();     // Output: Drawing a circle
        rectangle.draw();  // Output: Drawing a rectangle
    }
}
