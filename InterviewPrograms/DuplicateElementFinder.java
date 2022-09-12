

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

// Find or print the duplicate element of the list useing java 8 stream Api

public class DuplicateElementFinder {

    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(10, 23, 44, 55, 1, 10, 11, 1, 1, 1);
        HashSet<Integer> hashSet = new HashSet<>();

        asList.stream().filter(a -> !hashSet.add(a)).collect(Collectors.toSet())
                .forEach(a -> System.out.println(a));
    }
}
