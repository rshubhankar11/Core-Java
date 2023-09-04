import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * OptionalJava
 * Create a Optional class and use its methods
 */
public class OptionalJava {

    public static void main(String[] args) {
        useOptionalForNullCheck();
        // Always use Wrapper classes in array instead of primitive class
        // It will be easy to convert it to array list in that ways
        Integer[] arr = { 1, 3, 23, 44, 98 };

        List<Integer> nums = Arrays.asList(arr);

        Optional<Integer> reduce = nums.stream().reduce((a, b) -> a + b);
        Integer integer = nums.stream().reduce((a, b) -> a + b).get();
        System.out.println("Sum value : " + integer);

        Optional<Integer> max = nums.stream().reduce((o1, o2) -> o1 > o2 ? o1 : o2);
        Optional<Integer> min = nums.stream().reduce((o1, o2) -> o1 < o2 ? o1 : o2);
        System.out.println("max value : " + max.get());
        System.out.println("min value : " + min.get());

    }

    private static void useOptionalForNullCheck() {
        // Create Optional class without value
        Optional<Integer> intOp = Optional.ofNullable(null);
        // Create Optional class with value
        Optional<Integer> intOp1 = Optional.of(12);

        if (intOp.isPresent()) {
            Integer integer = intOp.get();
            System.out.println("is Present : " + integer);
        } else if (intOp.isEmpty()) {
            System.out.println("Is empty");
        }
    }
}