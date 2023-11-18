import java.util.Scanner;

/**
 * ReversString
 */
public class ReversString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = scanner.nextLine();
        scanner.close();
        char[] charArray = str.toCharArray();

        StringBuilder result = new StringBuilder();

        for (int i = charArray.length - 1; i >= 0; i--) {
            result.append(charArray[i]);
        }

        System.out.println(result);
    }
}