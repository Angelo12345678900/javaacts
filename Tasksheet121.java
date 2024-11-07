import static java.lang.Math.*;

public class Tasksheet121 {

    // Method for addition using Math.addExact
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Method for subtraction using Math.subtractExact
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Method for multiplication using Math.multiplyExact
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Method for division using Math.floorDiv to handle integer division
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is undefined.");
            return 0;
        }
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        // Demonstrate the math operations
        int a = 20, b = 5;

        System.out.println("Addition of " + a + " and " + b + " is: " + add(a, b));
        System.out.println("Subtraction of " + a + " and " + b + " is: " + subtract(a, b));
        System.out.println("Multiplication of " + a + " and " + b + " is: " + multiply(a, b));
        System.out.println("Division of " + a + " and " + b + " is: " + divide(a, b));

        // Additional test cases
        int x = 15, y = 3;
        System.out.println("Addition of " + x + " and " + y + " is: " + add(x, y));
        System.out.println("Subtraction of " + x + " and " + y + " is: " + subtract(x, y));
        System.out.println("Multiplication of " + x + " and " + y + " is: " + multiply(x, y));
        System.out.println("Division of " + x + " and " + y + " is: " + divide(x, y));
    }
}
