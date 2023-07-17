
/**
 * demo Static block will be executed at the class loading time so it will be
 * executed before the
 * main method..
 * 
 * Instance Block will be executed at the time of object creation so it will
 * executed after main
 * method ..
 * 
 * Constructor will be executed at the time of object reaction , a class can
 * have any number of constructor .. The name of the constructor must be same as
 * the name of Class
 * 
 * Methods are also called ase block , a method can either be static or instance
 * 
 * 
 */
public class DifferentBlocks {
    static {
        System.out.println("In static block outside main method " + '\n');
    }

    DifferentBlocks() {
        System.out.println("In Constructor  main method " + '\n');
    }

    public static void main(String[] args) {
        System.out.print("In main method " + '\n');

        // Demo demo = new Demo();

    }

    {
        System.out.println("In Instance Block " + '\n');

    }

}
