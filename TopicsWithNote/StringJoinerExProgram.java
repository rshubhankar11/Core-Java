
import java.util.ArrayList;
import java.util.StringJoiner;

/*
 * StringJoiner is a class in java.util package is used to construct
 * a sequence of characters(strings) separated by a delimiter and 
 * optionally starting with a supplied prefix and ending with a given
 * suffix. Though this can also be done with the help of the StringBuilder
 * class to append delimiter after each string, StringJoiner provides 
 * an easy way to do that without much code to write. 
 * 
 */
public class StringJoinerExProgram {

    // Main driver method
    public static void main(String[] args) {
        // Creating an empty ArrayList of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to above List
        al.add("Ram");
        al.add("Shyam");
        al.add("Alice");
        al.add("Bob");

        // Creating object of class inside main()
        StringJoiner sj1 = new StringJoiner(",", "{", "}");

        // Using setEmptyValue() method
        sj1.setEmptyValue("sj1 is empty");
        System.out.println(sj1);

        // Using add() method
        sj1.add(al.get(0)).add(al.get(1));
        System.out.println(sj1);

        // Using length() method
        System.out.println("Length of sj1 : "
                + sj1.length());

        StringJoiner sj2 = new StringJoiner(":");
        sj2.add(al.get(2)).add(al.get(3));

        // Using merge() method
        sj1.merge(sj2);

        // Using toString() method
        System.out.println(sj1.toString());

        System.out.println("Length of new sj1 : "
                + sj1.length());
    }
}
