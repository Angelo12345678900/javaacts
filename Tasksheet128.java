// Interface Shape with methods for calculating area and perimeter
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Abstract class AbstractShape that implements the Shape interface
abstract class AbstractShape implements Shape {
    // Common attributes for shapes
    String color;
    double length;
    double width;

    // Constructor to initialize common attributes
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // Concrete implementation for calculateArea (to be overridden in concrete classes)
    public abstract double calculateArea();

    // Concrete implementation for calculatePerimeter (to be overridden in concrete classes)
    public abstract double calculatePerimeter();
}

// Concrete class Circle extends AbstractShape
class Circle extends AbstractShape {
    double radius;

    // Constructor to initialize the attributes for Circle
    public Circle(String color, double radius) {
        super(color, 0, 0);  // Only the color and radius are relevant for Circle
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete class Rectangle extends AbstractShape
class Rectangle extends AbstractShape {

    // Constructor to initialize the attributes for Rectangle
    public Rectangle(String color, double length, double width) {
        super(color, length, width);  // Initialize color, length, and width
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class to test Circle and Rectangle
public class Tasksheet128 {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        // Display area and perimeter for Circle
        System.out.println("Circle:");
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Display area and perimeter for Rectangle
        System.out.println("\nRectangle:");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
