package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

/**
 * MakeAClassImmutable
 * 
 * Immutable class in java means that once an object is created, we cannot
 * change its content. In Java, all the wrapper classes (like Integer, Boolean,
 * Byte, Short) and String class is immutable. We can create our own immutable
 * class as well. Prior to going ahead do go through characteristics of
 * immutability in order to have a good understanding while implementing the
 * same. Following are the requirements:
 * 
 * 1. The class must be declared as final so that child classes can’t be
 * created.
 * 2. Data members in the class must be declared private so that direct access
 * is not allowed.
 * 3. Data members in the class must be declared as final so that we can’t
 * change the value of it after object creation.
 * 4. A parameterized constructor should initialize all the fields performing a
 * deep copy so that data members can’t be modified with an object reference.
 * 5. Deep Copy of objects should be performed in the getter methods to return a
 * copy rather than returning the actual object reference)
 * 
 * Note: There should be no setters or in simpler terms, there should be no
 * option to change the value of the instance variable.
 */

// Class 1
// An immutable class
final class Student {

    // Member attributes of final class
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;

    // Constructor of immutable class
    // Parameterized constructor
    public Student(String name, int regNo,
            Map<String, String> metadata) {

        // This keyword refers to current instance itself
        this.name = name;
        this.regNo = regNo;

        // Creating Map object with reference to HashMap
        // Declaring object of string type
        Map<String, String> tempMap = new HashMap<>();

        // Iterating using for-each loop
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }

        this.metadata = tempMap;
    }

    // Method 1
    public String getName() {
        return name;
    }

    // Method 2
    public int getRegNo() {
        return regNo;
    }

    // Note that there should not be any setters

    // Method 3
    // User -defined type
    // To get meta data
    public Map<String, String> getMetadata() {

        // Creating Map with HashMap reference
        Map<String, String> tempMap = new HashMap<>();

        for (Map.Entry<String, String> entry : this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}

public class MakeAClassImmutable {

    // Main driver method
    public static void main(String[] args) {

        // Creating Map object with reference to HashMap
        Map<String, String> map = new HashMap<>();

        // Adding elements to Map object
        // using put() method
        map.put("1", "first");
        map.put("2", "second");

        Student s = new Student("ABC", 101, map);

        // Calling the above methods 1,2,3 of class1
        // inside main() method in class2 and
        // executing the print statement over them
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetadata());

        // Uncommenting below line causes error
        // s.regNo = 102;

        map.put("3", "third");
        // Remains unchanged due to deep copy in constructor
        System.out.println(s.getMetadata());
        s.getMetadata().put("4", "fourth");
        // Remains unchanged due to deep copy in getter
        System.out.println(s.getMetadata());
    }

}

/*
 * OutPut:
 * ABC
 * 101
 * {1=first, 2=second}
 * {1=first, 2=second}
 * {1=first, 2=second}
 */
