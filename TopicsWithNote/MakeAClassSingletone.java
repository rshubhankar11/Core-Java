package InterviewPrograms;

/**
 * MakeAClassSingletone
 * 
 * In object-oriented programming, a singleton class is a class that can have
 * only one object (an instance of the class) at a time. After the first time,
 * if we try to instantiate the Singleton class, the new variable also points to
 * the first instance created. So whatever modifications we do to any variable
 * inside the class through any instance, affects the variable of the single
 * instance created and is visible if we access that variable through any
 * variable of that class type defined.
 * 
 * Remember the key points while defining class as a singleton class that is
 * while designing a singleton class:
 * 
 * 1. Make a constructor private.
 * 2. Write a static method that has the return type object of this singleton
 * class. Here, the concept of Lazy initialization is used to write this static
 * method.
 * 
 * Purpose of Singleton Class
 * The primary purpose of a Singleton class is to restrict the limit of the
 * number of object creation to only one. This often ensures that there is
 * access control to resources, for example, socket or database connection.
 * 
 * The memory space wastage does not occur with the use of the singleton class
 * because it restricts the instance creation. As the object creation will take
 * place only once instead of creating it each time a new request is made.
 * 
 * We can use this single object repeatedly as per the requirements. This is the
 * reason why the multi-threaded and database applications mostly make use of
 * the Singleton pattern in Java for caching, logging, thread pooling,
 * configuration settings, and much more.
 * 
 * For example, there is a license with us, and we have only one database
 * connection or suppose if our JDBC driver does not allow us to do
 * multithreading, then Singleton class comes into the picture and makes sure
 * that at a time, only a single connection or a single thread can access the
 * connection.
 * 
 * How to Design/Create a Singleton Class in Java?
 * To create a singleton class, we must follow the steps, given below:
 * 
 * 1. Ensure that only one instance of the class exists.
 * 
 * 2. Provide global access to that instance by
 * 
 * . Declaring all constructors of the class to be private.
 * . Providing a static method that returns a reference to the instance. The
 * lazy initialization concept is used to write the static methods.
 * . The instance is stored as a private static variable.
 * 
 */

// Java program implementing Singleton class
// with using getInstance() method

// Class 1
// Helper class
class Singleton {
    // Static variable reference of single_instance
    // of type Singleton
    private static Singleton single_instance = null;

    // Declaring a variable of type String
    public String s;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Singleton() {
        s = "Hello I am a string part of Singleton class";
    }

    // Static method
    // Static method to create instance of Singleton class
    public static Singleton getInstance() {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}

public class MakeAClassSingletone {
    public static void main(String args[]) {
        // Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();

        // Instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // Instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                + x.hashCode());
        System.out.println("Hashcode of y is "
                + y.hashCode());
        System.out.println("Hashcode of z is "
                + z.hashCode());

        // Condition check
        if (x == y && y == z) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}
/*
 * OutPut:
 * Hashcode of x is 1554547125
 * Hashcode of y is 1554547125
 * Hashcode of z is 1554547125
 * Three objects point to the same memory location on the heap i.e, to the same
 * object
 */
