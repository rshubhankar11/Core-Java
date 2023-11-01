import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Given a List of array find the augmented string and grp them
// Listen
// Pot
// Alas
// Silent
// Top
// Output : Print sets of anagrams (Listen, Silent),(Top,Pot)
public class AugmentedString {

    public static void main(String[] args) {

        List<String> words = List.of("Pot", "Alas", "Silent", "Listen", "Top");

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            String sortedWord = word.toLowerCase().chars()
                    .mapToObj(ch -> (char) ch)
                    .sorted()
                    .map(String::valueOf)
                    .collect(Collectors.joining());

            anagramGroups.computeIfAbsent(sortedWord, key -> new ArrayList<>()).add(word);
        }

        anagramGroups.values().stream()
                .filter(group -> group.size() > 1)
                .forEach(group -> System.out.println(group));

    }
}

/*
 * 1. Use `List.of(...)` to create an immutable list of words, which simplifies
 * the initialization.
 * 
 * 2. Replace the `resultMap` with a `Map<String, List<String>> anagramGroups`,
 * which directly maps the sorted words to lists of words with the same sorted
 * characters.
 * 
 * 3. Use a for-each loop to iterate through the words and compute the sorted
 * word once. The `computeIfAbsent` method is used to add words to the
 * appropriate group based on their sorted representation.
 * 
 * 4. After creating the `anagramGroups` map, you can directly filter and print
 * the anagram groups. This simplifies the final output.
 */