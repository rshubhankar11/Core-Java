
/**
 * Method Overriding
 * 
 * It is process of specifying two method having same method name and same
 * signature and same return type in two different classes having IS-A
 * Relationship
 * 
 * It can not be implemented in single class
 * 
 * Execution of method is based on the object that is created
 * 
 * Updated Note :
 * In any object-oriented programming language, Overriding is a feature that
 * allows a subclass or child class to provide a specific implementation of a
 * method that is already provided by one of its super-classes or parent
 * classes. When a method in a subclass has the same name, same parameters or
 * signature, and same return type(or sub-type) as a method in its super-class,
 * then the method in the subclass is said to override the method in the
 * super-class.
 * 
 * Method overriding is one of the way by which java achieve Run Time
 * Polymorphism.The version of a method that is executed will be determined by
 * the object that is used to invoke it. If an object of a parent class is used
 * to invoke the method, then the version in the parent class will be executed,
 * but if an object of the subclass is used to invoke the method, then the
 * version in the child class will be executed. In other words, it is the type
 * of the object being referred to (not the type of the reference variable) that
 * determines which version of an overridden method will be executed.
 * 
 * A constructor cannot be overridden.If you try to write a super class's
 * constructor in the sub class compiler treats it as a method and expects a
 * return type and generates a compile time error.
 */
class MethodOverridingEX {
    void methodOne(int a) {
        System.out.println("In Parent class methodOne");
    }
}

class MethodOverridingEXChild extends MethodOverridingEX {
    void methodOne(int a) {
        System.out.println("In Child class methodOne");
    }

    public static void main(String[] args) {
        // Using parent class object we only can access parent class methods
        MethodOverridingEX parent = new MethodOverridingEX();
        parent.methodOne(1);

        // Using child class object we can access child class methods
        MethodOverridingEXChild child = new MethodOverridingEXChild();
        child.methodOne(2);

        MethodOverridingEX childTwo = new MethodOverridingEXChild();
        childTwo.methodOne(2);
    }

}
// O/P
// In Parrent class methodOne
// In Child class methodOne
// In Child class methodOne