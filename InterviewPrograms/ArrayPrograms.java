package InterviewPrograms;

import java.util.Arrays;
import java.util.HashSet;

/*
 * Fint intersection and
 * Union 
 */
public class ArrayPrograms {

    public static void main(String[] args) {
        Integer[] arr1 = { 1, 3, 4, 5, 6, 7 };
        Integer[] arr2 = { 33, 44, 4, 5, 55 };

        HashSet<Object> set = new HashSet<>();

        set.addAll(Arrays.asList(arr1));
        // for intersection we have to use retainAll()
        // set.retainAll(Arrays.asList(arr2));

        // for Union we just have to addAll(), as set dont support duplicate
        // it will be set of uniques
        set.addAll(Arrays.asList(arr2));

        System.out.println(set);
    }
}
