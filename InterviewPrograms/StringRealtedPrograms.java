
import java.util.Arrays;
import java.util.List;

/**
 * StringRealtedPrograms
 * 
 * Q. We have a string "Rab3roshan4shu5jlj", we need to create a list out of it
 * and that list will
 * conatin without number . We have to splite the string where there is a number
 * and we need to
 * sotre it in a shaprate list
 * 
 */
public class StringRealtedPrograms {

    public static void main(String[] args) {

        String stringOfName = "Rab3ros3han4shu5j3j";

        // ? To remove all the digits from a string and to store it in a list we can to
        // it like
        // ?below .
        // ? We have to user java regular exprations to achive this
        List<String> asList = Arrays.asList(stringOfName.split("\\d"));
        System.out.println(asList);

        // ? To remove special character we can go for this regex [^\\p{L}\\p{Z}]
        // ? to remove symbols we can do this [-+.^:,]
        // ? And to remove "[^a-z]" "[^A-Z]"

    }

}
