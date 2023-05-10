/* 
 *Encapsulation:
 *Encapsulation is the process of wrapping data (variables) and methods (functions) together 
 *into a single unit called a class. It helps in data hiding and provides control over access 
 *to class members. The class defines the behavior and properties of an object, and encapsulation
 *ensures that the internal implementation details are hidden from outside access.
 */
public class Encapsulation {
    private String model;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    // In this example, the Encapsulation class has private variables model and
    // year. These
    // variables are encapsulated within the class, meaning they are not directly
    // accessible from outside the class. Instead, public getter and setter methods
    // (getModel(), setModel(), getYear(), setYear()) are provided to access and
    // modify the values of these variables. This way, we have control over how the
    // data is accessed and modified.
}
