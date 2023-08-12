/* 
 * 
 * 
 * Question is to sort this :
 * 
 * string [] arr ={"1.0.0","1.0.0.2","3.1.0","3.0.1","1.2.3.1"} 
 */

import java.util.Arrays;
import java.util.Comparator;

public class volkswagen {
    public static void main(String[] args) {

        String[] arr = { "1.0.0", "1.0.0.2", "3.1.0", "3.0.1", "1.2.3.1" };

        // Sort the array using the custom VersionComparator
        Arrays.sort(arr, new VersionComparator());

        Arrays.asList(arr).stream().forEach(str -> System.out.printf(str + " , "));
        // Out put: 1.0.0 , 1.0.0.2 , 1.2.3.1 , 3.0.1 , 3.1.0 ,

    }

}

/**
 * VersionComparator implements
 */
class VersionComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        // Split the version strings into parts using the period as delimiter

        String[] subStrinOne = o1.split("\\.");
        String[] subStrinTwo = o2.split("\\.");
        // Determine the minimum length of parts in both versions
        int min = Math.min(subStrinOne.length, subStrinTwo.length);
        // Compare each part numerically

        for (int i = 0; i < min; i++) {
            int compare = Integer.compare(Integer.parseInt(subStrinOne[i]), Integer.parseInt(subStrinTwo[i]));
            // If parts are not equal, return the comparison result

            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(subStrinOne.length, subStrinTwo.length);
    }

}