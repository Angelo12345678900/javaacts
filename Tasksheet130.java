import java.util.Scanner;
import java.util.InputMismatchException;

public class Tasksheet130 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for the first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            // Prompt user for the second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Perform the division and display the result
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Cannot divide by zero!");
        } catch (InputMismatchException e) {
            // Handle invalid input (non-integer)
            System.out.println("Error: Please enter a valid integer.");
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            System.out.println("Error: An unexpected error occurred.");
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
