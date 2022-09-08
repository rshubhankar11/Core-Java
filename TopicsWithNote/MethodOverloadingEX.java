/**
 * MethodOverloadingEX
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