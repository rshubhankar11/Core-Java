import java.text.Collator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Second {
    public static void main(String[] args) {
        stringQOne();
        stringQTwo();
    }

    private static void stringQTwo() {
        // Given a string Count the charter occurrence

        String str = "RabirosahanShubhankar";
        Map<Character, Long> collect = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect.toString());
    }

    private static void stringQOne() {
        // Given a string remove the second occurred charters
        String str = "I am at amsterdam";
        StringBuilder resutl = new StringBuilder();
        str.chars().mapToObj(ch -> (char) ch)
                .forEach(ch -> {
                    if (Character.isWhitespace(ch)) {
                        resutl.append(ch);
                    }
                    if (resutl.indexOf(ch.toString()) < 0) {
                        resutl.append(ch);
                    }
                });

        System.out.println(resutl);
    }
}
