
import java.util.Arrays;

/**
 * InfosysInterviewQ
 * 
 * 
 * 
 * Write a function: class Solution { public int solution(int[] A); } that,
 * given an array A of N
 * integers, returns the smallest positive integer (greater than 0) that does
 * not occur in A. For
 * example, given A = [1, 3, 6, 4, 1, 2], the function should return 5. Given A
 * = [1, 2, 3], the
 * function should return 4. Given A = [−1, −3], the function should return 1.
 */

public class InfosysInterviewQ {

    /**
     * This method will return the smallest positive number which is not present in
     * the array
     * 
     * @param array
     * @return
     */
    public static int solution(int[] a) {
        // sorting the array
        Arrays.sort(a);
        // Smallest element of the array
        int counter = a[0];
        int counterNegative = 1;
        // For positive numbers
        for (int i = 0; i < a.length; i++) {
            if (counter == a[i]) {
                counter = counter + 1;
            }
        }
        // in case when smallest number which is missing in our array is a negative
        // number
        if (counter < 0) {
            for (int i = 0; i < a.length; i++) {
                if (counterNegative == a[i]) {
                    counterNegative = counterNegative + 1;
                }
            }
            return counterNegative;
        }
        return counter;
    }

    public static void main(String[] args) {
        // int[] A = new int[] { 1, 3, 6, 4, 1, 2 };
        // int[] A = new int[] { 1, 2, 3 };
        int[] A = new int[] { -1, -3 };

        // int[] A = new int[] { -10000, 10000, 1, 999, 2 };

        // int[] A = new int[] { 71, 72, 73, 1, 2, 3, 4 };

        int solution = solution(A);
        System.out.println(solution);
    }

}
