/* 
*Abstraction:
*Abstraction is the process of hiding complex implementation details 
*and providing a simplified interface to the users.
* It focuses on what an object does rather than how it does it.
* Abstract classes and interfaces are used to achieve abstraction in Java. 
*/
public class Abstraction {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Output: Woof!
        cat.makeSound(); // Output: Meow!
    }
    // In this example,
    // the Animal class is an abstract class with an
    // abstract method makeSound(). The Dog and Cat classes extend the Animal class
    // and provide their own implementation of the makeSound() method. The Main
    // class demonstrates abstraction by creating instances of Dog and Cat and
    // calling the makeSound() method without worrying about the specific
    // implementation details of each animal. This way, we can work with the
    // abstract concept of an "animal" without knowing the specifics of individual
    // animal types.

    // By encapsulating data and providing abstraction, we can create more organized
    // and maintainable code while hiding unnecessary details from the users of our
    // classes.
}

public abstract class Animal {
    public abstract void makeSound();
}

public class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}
