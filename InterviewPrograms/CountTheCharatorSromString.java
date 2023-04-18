import java.util.HashMap;
import java.util.Scanner;

/**
 * CountTheCharatorSromString
 * 
 * Q. Count the duplicate charater from s given string
 * 
 * O/P: Enter a string: abbccssa a : 2 b : 2 c : 2 s : 2
 * 
 */
public class CountTheCharatorSromString {

    // This will show all the charactors
    public static void countCharator(String inpuString) {
        // This map will store the character as the key and count as value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        inpuString.chars().forEach(a -> {
            char charactor = (char) a;
            // This condition will evaluate if the map already have the key
            if (charCountMap.containsKey(charactor)) {
                int count = charCountMap.get(charactor);
                charCountMap.put(charactor, count + 1);
            } else {
                charCountMap.put(charactor, 1);
            }

        });

        charCountMap.entrySet().forEach(a -> System.out.println(a.getKey() + " : " + a.getValue()));
        System.out.println(charCountMap);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        countCharator(inputString);
    }
}
// O/P: Enter a string: abbccssa
// a : 2
// b : 2
// c : 2
// s : 2
// {a=2, b=2, c=2, s=2}
