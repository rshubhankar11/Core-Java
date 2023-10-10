import java.util.ArrayList;

public class SecondLargestInList {
    /**
     * 
     * Write a Java program to find the second largest elements in a list of
     * integers using streams. Or else return null.
     * 
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Integer> intLIst = new ArrayList<>();
        intLIst.add(21);
        intLIst.add(2);
        intLIst.add(44);
        intLIst.add(32);
        intLIst.add(3);
        intLIst.add(1);

        Integer result = intLIst.stream().sorted().skip(intLIst.size() - 2).findFirst().orElse(null);
        System.out.println(result);
    }
}
