import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * StringWordCount
 * 
 * !!This was asked in Congnizent interview
 * 
 * *Todo: Count the words form a given string "i HAVE have interview today java sql interview sql is
 * *and database sql";
 * 
 * 
 */
public class StringWordCount {
    public static void main(String[] args) {
        String inputString =
                "i HAVE have interview today java sql interview sql is and database sql";
        Map<String, Integer> wordContMap = countWords(inputString);
        System.out.println(wordContMap);
    }

    public static Map<String, Integer> countWords(String inputString) {
        // Converting the string to array
        String[] wordArray = inputString.toLowerCase().split(" ");
        // Converting the array to list
        List<String> asList = Arrays.asList(wordArray);
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        asList.stream().forEach(word -> {
            if (wordCountMap.containsKey(word)) {
                // This will exicute if the word is already existe
                // it will get and update the count by one
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // This will exicute if the word is not avilabe in the map
                // This will insert the word with count as 1
                wordCountMap.put(word, 1);
            }
        });
        return wordCountMap;
    }
}


