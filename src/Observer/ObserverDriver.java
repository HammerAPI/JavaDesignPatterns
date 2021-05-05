package Observer;

import Observer.Interfaces.Observer;
import Observer.Interfaces.Subject;
import Observer.Implementation.ConcreteObserver;
import Observer.Implementation.ConcreteSubject;

/**
 * Driver to demonstrate the Observer Design Pattern.
 *
 * @author Daniel Hammer
 * @version 2021-05-01
 */
public class ObserverDriver {

    /** Constant for the number of Observers to generate and register. */
    private static final int NUM_OBSERVERS = 3;

    /**
     * Main method of execution.
     */
    public static void go() {
        Subject<String> subject = new ConcreteSubject("apples");
        System.out.println("\nCreated Subject with state: " + subject.getState());


        System.out.println("\nCreating " + NUM_OBSERVERS + " Observers to listen to the Subject:");
        for (int i = 0; i < NUM_OBSERVERS; i++) {
            new ConcreteObserver(i, subject);
        }

        System.out.println("\nUpdating Subject's state:");
        subject.setState("bananas");

        System.out.println("\nCurrent Subject state: " + subject.getState());
    }
}
