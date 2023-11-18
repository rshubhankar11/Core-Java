/* /
 * 
 * Reverse an array without changing positions of special characters. 
 *  Input:     Hey#%World
 * Output:    dlr#%oWyeH
 * 
 * 
 * 
 * 
 * Time complexity of the below will be : BigO of n
 * 
 * 
 * 
 * 
 */

public class ReverseArraySpecialCharacters {

    // Function to check if a character is a special character or not
    static boolean isSpecialCharacter(char ch) {
        return !Character.isLetterOrDigit(ch);
    }

    // Function to reverse an array without changing positions of special characters
    static String reverseWithSpecialChars(String input) {
        char[] charArray = input.toCharArray();

        int left = 0, right = charArray.length - 1;

        while (left < right) {
            if (!isSpecialCharacter(charArray[left])) {
                if (!isSpecialCharacter(charArray[right])) {
                    // Swap non-special characters
                    char temp = charArray[left];
                    charArray[left] = charArray[right];
                    charArray[right] = temp;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "Hey#%World";
        String output = reverseWithSpecialChars(input);
        System.out.println("Input:  " + input);
        System.out.println("Output: " + output);
    }
}
