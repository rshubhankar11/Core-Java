
/**
 * Method Overloading
 * 
 * It is a process of sepcifing multiple method having same name and different
 * mehod signature (Which is different number of Parameters , type of Parametes
 * and order of Parameters)
 * 
 * Method Over loading can be done in same class or in two different class
 * having IS-A Realtionship(Parrent Child Relationship/Inhertance)
 * 
 * We can write two or more class in same file if we dont specify with any
 * access specifier (like public or private )
 * 
 * 
 * Note Upadted:
 * Method Overloading allows different methods to have the same name, but
 * different signatures where the signature can differ by the number of input
 * parameters or type of input parameters, or a mixture of both.
 * 
 * Method overloading is also known as Compile-time Polymorphism, Static
 * Polymorphism, or Early binding in Java. In Method overloading compared to
 * parent argument, child argument will get the highest priority.
 * 
 */
class MethodOverloadingEX {

    void methodOne(int a) {
        System.out.println("In Parrent class methodOne");
    }

}

class MethodOverloadingEXChild extends MethodOverloadingEX {
    void methodTwo(double a) {
        System.out.println("In Child class methodTwo");
    }

    public static void main(String[] args) {
        // Using parrent class object we only can access parrent class methods
        MethodOverloadingEX parrent = new MethodOverloadingEX();
        parrent.methodOne(1);

        // Using child class object we can access both parrent and child class methods
        MethodOverloadingEXChild child = new MethodOverloadingEXChild();
        child.methodOne(2);
        child.methodTwo(3.4);

    }
}