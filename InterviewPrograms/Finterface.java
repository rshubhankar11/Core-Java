

/*
 * A functional interface is an interface that contains only one abstract method. They can have only
 * one functionality to exhibit. From Java 8 onwards, lambda expressions can be used to represent
 * the instance of a functional interface. A functional interface can have any number of default
 * methods.
 */

@FunctionalInterface
interface CustomInterface {
    int mul(int x, int y);
}

/*
 * Q. Using Functional interface multiply 2 number use java 8 Jamda exp to give implementaion
 */


public class Finterface {

    public static void main(String[] args) {
        CustomInterface cal = (a, b) -> a * b;

        System.out.print(cal.mul(2, 3));
    }
}
