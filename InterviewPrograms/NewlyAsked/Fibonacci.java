import java.util.stream.IntStream;

/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
        int num = 10;
        withoutJava8(num);

    }

    private static void withoutJava8(int num) {
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 0; i < num; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a);

        }
    }
}