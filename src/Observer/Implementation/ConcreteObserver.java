package Observer.Implementation;

import Observer.Interfaces.Observer;
import Observer.Interfaces.Subject;

/**
 * Models an Observer, or entity that listens to a Subject.
 *
 * @author Daniel Hammer
 * @version 2021-05-05
 */
public class ConcreteObserver implements Observer {

    /** The Subject being observed. */
    private Subject subject;

    /** ID field to identify observers. */
    private int id;

    /**
     * Construct a new Observer instance.
     *
     * @param id The ID of this Observer.
     * @param subject The Subject to observer.
     */
    public ConcreteObserver(int id, Subject subject) {
        this.id = id;
        this.subject = subject;

        // Register this Observer with the Subject
        this.subject.register(this);
    }

    /**
     * Notifies this Observer that its subject has been updated.
     */
    public void update() {
        // For our implementation, we just want to print a message once notified
        System.out.println("Observer #" + this.id + " was notified of an update");
    }
}
