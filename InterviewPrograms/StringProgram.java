/* 
 * 
 * 
 * Given a string remove all the repeated chars 
 * Input String   String s = "I am at amsterdam";
* Out put should be : // I am t serd
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringProgram {

    public static void main(String[] args) {
        String s = "I am at amsterdam";
        StringBuilder result = new StringBuilder();

        HashSet<Character> hashSet = new HashSet<>();
        s.replace(" ", "");
        for (int index = 0; index < s.length(); index++) {
            if (hashSet.add(s.charAt(index)))
                result.append(s.charAt(index) + " ");
            // s.contains(

        }
        List<Character> strLIst = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        System.out.println(strLIst.toString());

        String[] stringArr = s.split("");

        System.out.println(result);
    }

}

class RemoveSecondOccurrence {
    public static void main(String[] args) {
        String s = "I am at amsterdam";
        String modifiedString = removeSecondOccurrence(s);
        System.out.println(modifiedString);
    }

    public static String removeSecondOccurrence(String input) {
        Map<Character, Integer> charCount = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            char lowerCaseC = Character.toLowerCase(c);
            if (charCount.containsKey(lowerCaseC)) {
                charCount.put(lowerCaseC, charCount.get(lowerCaseC) + 1);
                if (charCount.get(lowerCaseC) <= 2) {
                    result.append(c);
                }
            } else {
                charCount.put(lowerCaseC, 1);
                result.append(c);
            }
        }

        return result.toString();
    }
}
