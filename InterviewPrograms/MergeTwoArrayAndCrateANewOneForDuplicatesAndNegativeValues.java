import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArrayAndCrateANewOneForDuplicatesAndNegativeValues {
    public static void main(String[] args) {
        // Input arrays
        Integer[] array1 = { -4, 7, 3, 2, 9 };
        Integer[] array2 = { 9, 3, 7, 2, 3 };

        // Convert arrays to ArrayLists
        List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));

        // Merge the two lists and store the result in mergedList
        List<Integer> mergedList = mergeLists(list1, list2);

        List<Integer> duplicateAndNegativeValuesList = findDuplicatesAndNegatives(mergedList);
        duplicateAndNegativeValuesList.stream().forEach(num -> System.out.print(num + " "));
        // Remove duplicates and negatives from mergedList
        List<Integer> filteredList = removeDuplicatesAndNegatives(mergedList);

        // Print the merged list after removing duplicates and negatives
        System.out.println("Merged List (After removing duplicates and negatives):");
        filteredList.forEach(num -> System.out.print(num + " "));
    }

    // Merge two lists using Stream.concat()
    public static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        return Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
    }

    // Remove duplicates and negatives from the list using Collection and Stream API
    public static List<Integer> removeDuplicatesAndNegatives(List<Integer> list) {
        return list.stream()
                .filter(num -> num >= 0) // Filter out negative values
                .distinct() // Remove duplicates
                .collect(Collectors.toList());
    }

    // Find duplicates and negatives in a list using Collection and Stream API
    public static List<Integer> findDuplicatesAndNegatives(List<Integer> list) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        List<Integer> duplicatesAndNegatives = new ArrayList<>();

        list.forEach(num -> {
            if (num < 0 || !uniqueElements.add(num)) {
                duplicatesAndNegatives.add(num);
            }
        });

        return duplicatesAndNegatives.stream().distinct().collect(Collectors.toList());
    }
}
