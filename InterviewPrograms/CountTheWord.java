package InterviewPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * CountTheWord
 * 
 * Count the no of occurrence of words in given string using Java 8
 * Input: "welcome to code decode and code decode welcome you B";
 * Output: [code=2, and=1, to=1, decode=2, welcome=2, you=1}
 */
public class CountTheWord {

    public static void main(String[] args) {
        String str = "welcome to code decode and code decode welcome you B";
        List<String> listOfWords = Arrays.asList(str.split(" "));
        // System.out.println(listOfWords);
        Map<String, Long> mapOfWords = listOfWords.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mapOfWords);
    }

}