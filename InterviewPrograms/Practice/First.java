package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import java.util.stream.IntStream;

public class First {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer[] arr1 = { 1, 3, 4, 5, 6, 89, 7, 0 };
        Integer[] arr2 = { 33, 44, 4, 5, 55 };

        getMinMax(arr1);

        // unionOfArray(arr1, arr2);

        // intersectionOfArrays(arr1, arr2);

        // countCharters();

        // countWordsInString();

        // sortingStringVersions();

    }

    private static void getMinMax(Integer[] arr1) {
        Integer min = Arrays.stream(arr1).reduce((a, b) -> a < b ? a : b)
                .orElseThrow(() -> new IllegalStateException("not found"));
        System.out.println("Min value of the array : " + min);
        Integer max = Arrays.stream(arr1).reduce((a, b) -> a > b ? a : b)
                .orElseThrow(() -> new IllegalStateException("Not Found"));
        System.out.println("Max value of the array : " + max);
    }

    private static void sortingStringVersions() {
        System.out.println("=====================");

        String[] arr = { "1.0.0", "1.0.0.2", "3.1.0", "3.0.1", "1.2.3.1" };
        List<String> asList = Arrays.asList(arr);
        asList.stream().sorted(Comparator.comparing((String version) -> {
            String[] str = version.split("\\.");
            return str;
        }, ((subStringOne, subStringTwo) -> {
            int min = Math.min(subStringOne.length, subStringTwo.length);
            // Compare each part numerically
            for (int i = 0; i < min; i++) {
                int compare = Integer.compare(Integer.parseInt(subStringOne[i]), Integer.parseInt(subStringTwo[i]));
                // If parts are not equal, return the comparison result
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(subStringOne.length, subStringTwo.length);
        }))).forEach(System.out::println);
    }

    private static void countWordsInString() {
        System.out.println("------------String Word count -----------");
        String str = "my name is Rabiroshan Shubhankar Shubhankar ";
        List<String> asList = Arrays.asList(str.split("\\s+"));
        asList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .forEach(System.out::println);
    }

    private static void countCharters() {
        System.out.println("********String********");
        // Count the Charters of the string
        String str = "jhjkahfjharrreraaaa";

        Map<Character, Long> collect = str.chars().mapToObj(a -> (char) a)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.entrySet().forEach(System.out::print);
    }

    private static void intersectionOfArrays(Integer[] arr1, Integer[] arr2) {
        HashSet<Integer> hashSet = new HashSet<>();

        List<Integer> asList = Arrays.asList(arr1);
        List<Integer> asList1 = Arrays.asList(arr2);
        hashSet.addAll(asList1);
        hashSet.retainAll(asList);
        System.out.println("Intersection of two array");
        hashSet.stream().sorted().forEach(System.out::println);
    }

    private static void unionOfArray(Integer[] arr1, Integer[] arr2) {
        HashSet<Integer> hashSet = new HashSet<>();

        // Logic to do the UNION of for both the sets
        Arrays.stream(arr1).forEach(number -> hashSet.add(number));
        Arrays.stream(arr2).forEach(number -> hashSet.add(number));
        hashSet.stream().sorted().forEach(System.out::println);
    }

}

class SmallestMissingPositiveJava8 {
    public static int solution(int[] A) {
        // Step 1: Filter out positive numbers from the array and convert them to a set
        Set<Integer> positiveSet = Arrays.stream(A)
                .filter(num -> num > 0)
                .boxed()
                .collect(Collectors.toSet());

        // Step 2: Generate a stream of integers from 1 to Integer.MAX_VALUE
        return IntStream.rangeClosed(1, Integer.MAX_VALUE)
                // Step 3: Filter the stream to find the first missing positive
                .filter(num -> !positiveSet.contains(num))
                .findFirst()
                // Step 4: Get the first missing positive, or throw an exception if none is
                // found
                .orElseThrow(() -> new RuntimeException("No missing positive integer found"));
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 6, 4, 1, 2 };
        int result1 = solution(arr1);
        System.out.println("Smallest missing positive: " + result1); // Output: 5

        int[] arr2 = { 1, 2, 3 };
        int result2 = solution(arr2);
        System.out.println("Smallest missing positive: " + result2); // Output: 4

        int[] arr3 = { -1, -3 };
        int result3 = solution(arr3);
        System.out.println("Smallest missing positive: " + result3); // Output: 1
    }
}
