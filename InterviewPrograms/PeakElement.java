/**
 * PeakElement
 * 
 * An element is called a peak element if its value is not smaller than the
 * value of its adjacent elements(if they exists).
 * Given an array arr[] of size N, Return the index of any one of its peak
 * elements.
 * Note: The generated output will always be 1 if the index that you return is
 * correct. Otherwise output will be 0.
 * 
 * Input:
 * N = 3
 * arr[] = {1,2,3}
 * Possible Answer: 2
 * Generated Output: 1
 * Explanation: index 2 is 3.
 * It is the peak element as it is
 * greater than its neighbour 2.
 * If 2 is returned then the generated output will be 1 else 0.
 */
public class PeakElement {
    static int findPeak(int arr[], int n) {
        // First or last element is peak element
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;
        // Check for every other element
        for (int i = 1; i < n - 1; i++) {
            // Check if the neighbors are smaller
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                return i;
        }
        return 0;
    }

    // A binary search based function
    // that returns index of a peak element
    static int findPeakUtil(
            int arr[], int low, int high, int n) {
        // Find index of middle element
        // low + (high - low) / 2
        int mid = low + (high - low) / 2;

        // Compare middle element with its
        // neighbours (if neighbours exist)
        if ((mid == 0 || arr[mid - 1] <= arr[mid])
                && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            return mid;

        // If middle element is not peak
        // and its left neighbor is
        // greater than it, then left half
        // must have a peak element
        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return findPeakUtil(arr, low, (mid - 1), n);

        // If middle element is not peak
        // and its right neighbor
        // is greater than it, then right
        // half must have a peak
        // element
        else
            return findPeakUtil(
                    arr, (mid + 1), high, n);
    }

    // A wrapper over recursive function
    // findPeakUtil()
    static int findPeakAlgo(int arr[], int n) {
        return findPeakUtil(arr, 0, n - 1, n);
    }

    // Driver Code
    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;
        System.out.print("Index of a peak point is " + findPeak(arr, n));
    }

}