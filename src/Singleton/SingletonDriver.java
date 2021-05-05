package Singleton;

import Singleton.Implementation.Singleton;

/**
 * Models a class that uses a Singleton instance.
 */
public class SingletonDriver {
    /**
     * Main method of execution.
     */
    public void go() {
        // Here we get the instance of the Singleton.
        Singleton singleton = Singleton.getInstance();

        // Now let's make it do some work
        singleton.doStuff();

        // If we try and get another instance, we end up with the same one as before.
        Singleton otherSingleton = Singleton.getInstance();
        otherSingleton.doStuff();

        // To prove this. let's try changing the first one's name
        singleton.setName("Mrs. Singleton");

        // Note how the outputs for both of these is the same now
        singleton.doStuff();
        otherSingleton.doStuff();
    }
}
