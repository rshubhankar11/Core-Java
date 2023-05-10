import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(121, 10, 5, 3, 8, 7, 3, 0, -1, -55);

        // Create two ArrayLists using groupingBy() and stream
        Map<Boolean, List<Integer>> divisibleBy5AndNotBy4 = numbers.stream()
                .collect(Collectors.groupingBy(num -> num % 5 == 0 && num % 4 != 0));

        List<Integer> divisibleBy5 = divisibleBy5AndNotBy4.getOrDefault(true, new ArrayList<>());
        List<Integer> notDivisibleBy4 = divisibleBy5AndNotBy4.getOrDefault(false, new ArrayList<>());

        // Print the results
        System.out.println("Divisible by 5: " + divisibleBy5);
        System.out.println("Not divisible by 4: " + notDivisibleBy4);
    }
}
// In this program, we start with the given list of integers numbers. We then
// use the stream() method to convert the list into a stream, which allows us to
// perform various operations on the elements.

// We apply the groupBy() method on the stream and provide a lambda expression
// that checks the divisibility criteria (num % 5 == 0 && num % 4 != 0). This
// will group the numbers based on whether they are divisible by 5 and not
// divisible by 4.

// The result of groupBy() is a Map<Boolean, List<Integer>>, where the key true
// corresponds to the divisible by 5 and not divisible by 4 numbers, and the key
// false corresponds to the numbers that do not meet these criteria.

// Finally, we use getOrDefault() to retrieve the lists from the map, providing
// empty ArrayLists as defaults in case there are no elements in a particular
// group.

// We then print the results, displaying the numbers divisible by 5 and the
// numbers not divisible by 4 separately.

// Running this program will produce the following output:
// Divisible by 5: [10, 5, 0, -55]
// Not divisible by 4: [121, 3, 8, 7, 3, -1]
