import java.util.*;

/* 
 * 
 * Print triplet in an array resulting to a sum 0. 
 *
 * Input: [1,2,3,-1,-2,-4] 
 * Output: [1,3,-4] or [3,-1,-2]
 * 
 * Time complexity : O(n log n) + O(n^2) == O(n^2)
 */

public class TripletsSumZero {

    // Function to find triplets that sum up to zero in the given array
    static List<List<Integer>> findTriplets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array to efficiently use the two-pointer technique
        Arrays.sort(nums);

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int left = i + 1;
                int right = nums.length - 1;
                int target = -nums[i]; // Calculate the target sum

                // Use two pointers approach to find pairs that sum up to the target
                while (left < right) {
                    if (nums[left] + nums[right] == target) {
                        // Triplet found, add it to the result list
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        // Skip duplicates for left and right pointers
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        while (left < right && nums[right] == nums[right - 1])
                            right--;

                        // Move pointers to the next unique elements
                        left++;
                        right--;
                    } else if (nums[left] + nums[right] < target) {
                        // If the sum is less than the target, move left pointer
                        left++;
                    } else {
                        // If the sum is greater than the target, move right pointer
                        right--;
                    }
                }
            }
        }

        return result; // Return the list of triplets
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, -1, -2, -4 };
        List<List<Integer>> triplets = findTriplets(input);

        // Display the found triplets or a message if no triplets were found
        if (triplets.isEmpty()) {
            System.out.println("No triplets found with sum 0.");
        } else {
            System.out.println("Triplets with sum 0:");
            for (List<Integer> triplet : triplets) {
                System.out.println(triplet);
            }
        }
    }
}
