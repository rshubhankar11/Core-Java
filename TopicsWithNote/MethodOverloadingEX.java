
/**
 * Method Overloading
 * 
 * It is a process of specifying multiple method having same name and different
 * method signature (Which is different number of Parameters , type of Parameter
 * and order of Parameters)
 * 
 * Method Over loading can be done in same class or in two different class
 * having IS-A Relationship(Parent Child Relationship/Inheritance)
 * 
 * We can write two or more class in same file if we don't specify with any
 * access specifier (like public or private )
 * 
 * 
 * Note Updated:
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
        System.out.println("In Parament class methodOne");
    }

}

class MethodOverloadingEXChild extends MethodOverloadingEX {
    void methodTwo(double a) {
        System.out.println("In Child class methodTwo");
    }

    public static void main(String[] args) {
        // Using parent class object we only can access parent class methods
        MethodOverloadingEX parent = new MethodOverloadingEX();
        parent.methodOne(1);

        // Using child class object we can access both parent and child class methods
        MethodOverloadingEXChild child = new MethodOverloadingEXChild();
        child.methodOne(2);
        child.methodTwo(3.4);

    }
}