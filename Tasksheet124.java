import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Tasksheet124 {

    public static void main(String[] args) {
        // Create a list of integers with both positive and negative numbers
        List<Integer> numbers = Arrays.asList(3, -2, 10, 15, -7, 8, 0, 21, -3, 5);

        // Define predicates using lambda expressions
        Predicate<Integer> isPositive = num -> num >= 0;
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isGreaterThan10 = num -> num > 10;

        // Filter the list based on each predicate and collect the results
        List<Integer> positiveNumbers = numbers.stream()
                .filter(isPositive)
                .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());

        List<Integer> greaterThan10Numbers = numbers.stream()
                .filter(isGreaterThan10)
                .collect(Collectors.toList());

        // Print the results
        System.out.println("Original List: " + numbers);
        System.out.println("Positive Numbers: " + positiveNumbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Numbers Greater Than 10: " + greaterThan10Numbers);
    }
}
