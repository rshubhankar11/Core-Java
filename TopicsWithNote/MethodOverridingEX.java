package TopicsWithNote;

/**
 * MethodOverridingEX
 * 
 * It is process of specifing two method having same mthod name and same
 * signature and same returen type in two diffrent classess having IS-A
 * Realtionship
 * 
 * It cant be implemented in single class
 * 
 * Execution of method is based on the object that is created
 */
class MethodOverridingEX {
    void methodOne(int a) {
        System.out.println("In Parrent class methodOne");
    }
}

class MethodOverridingEXChild extends MethodOverridingEX {
    void methodOne(int a) {
        System.out.println("In Child class methodOne");
    }

    public static void main(String[] args) {
        // Using parrent class object we only can access parrent class methods
        MethodOverridingEX parrent = new MethodOverridingEX();
        parrent.methodOne(1);

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