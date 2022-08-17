/**
 * demo
 * Static block will be exicuted at the class loading time so it will be
 * exicuted before the main method..
 * 
 * Instance Block will be exicuted at the time of object creation so it will
 * exicuted after main method ..
 */
public class Demo {
    static {
        System.out.println("In static block outside main method " + '\n');
    }

    public static void main(String[] args) {
        System.out.print("In main method " + '\n');

        Demo demo = new Demo();

    }

    {
        System.out.println("In Instance Block " + '\n');

    }

}