package Singleton.Implementation;

/**
 * A Singleton Class.
 *
 * Models a class that can only exist in a single instance.
 */
public class Singleton {

    /** A private and static instance of the Singleton object. */
    private static Singleton instance = new Singleton();

    /** A Singleton can have any number of fields. */
    private String name;

    /**
     * Private constructor for the Singleton object.
     */
    private Singleton() {
        this.name = "Mr. Singleton";
    }

    /**
     * Public getter method for the single instance of the Singleton.
     *
     * @return The only instance of the Singleton.
     */
    public static Singleton getInstance() {
        return instance;
    }

    /**
     * Generic setter method to change the Singleton's name.
     *
     * @param name The new name of the Singleton.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Simple method to showcase how the Singleton can be used.
     */
    public void doStuff() {
        System.out.println("Hello from " + this.name + "!"); 
    }
}
