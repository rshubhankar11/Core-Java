import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Threed
 */
public class Threed {

    public static void main(String[] args) {
        // String[] arr = { "1.0.0", "1.0.0.2", "3.1.0", "3.0.1", "1.2.3.1" };

        // Arrays.sort(arr, new InnerThreed());
        // Arrays.asList(arr).stream().forEach(str -> System.out.printf(str + " , "));

        String str = "This iTs for testing ";
        StringBuffer result = new StringBuffer();

        str.chars().mapToObj(ch -> (char) ch)
                .forEach(c -> {
                    if (result.indexOf(c.toString()) < 0) {
                        result.append(c);
                    }
                });

        System.out.println(result);
        Character character = result.chars().mapToObj(ch -> (char) ch).findFirst().get();
        System.out.println(character);
        // Map<Character, Long> collect = str.chars().mapToObj(ch
        // ->Character.toLowerCase((char) ch) )
        // .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        // collect.entrySet().stream().forEach(a -> System.out.println(a.getKey() + " :
        // " + a.getValue()));
    }
}

// /**
// * InnerThreed
// */
// class InnerThreed implements Comparator<String> {

// @Override
// public int compare(String o1, String o2) {

// String[] subOne = o1.split("\\.");
// String[] subTwo = o2.split("\\.");

// int min = Math.min(subOne.length, subTwo.length);

// for (int i = 0; i < min; i++) {
// int compare = Integer.compare(Integer.parseInt(subOne[i]),
// Integer.parseInt(subTwo[i]));
// if (compare != 0) {
// return compare;
// }
// }

// return Integer.compare(subOne.length, subTwo.length);
// }

// }