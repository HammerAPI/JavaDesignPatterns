package Observer.Implementation;

import java.util.List;
import java.util.ArrayList;

import Observer.Interfaces.Subject;
import Observer.Interfaces.Observer;

/**
 * Models a Subject, or entity being observed.
 *
 * @author Daniel Hammer
 * @version 2021-05-05
 */
public class ConcreteSubject implements Subject<String> {

    /** Each subject holds a reference to all of its listeners. */
    private List<Observer> observers;

    /** State of the subject. */
    private String state;

    /**
     * Constructs a new Subject instance.
     *
     * @param state The state of the Subject.
     */
    public ConcreteSubject(String state) {
        this.observers = new ArrayList<Observer>();
        this.state = state;
    }

    /**
     * Register an Observer to listen to this Subject.
     *
     * @param observer The Observer to register.
     */
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * Unregister an Observer to stop listen to this Subject.
     *
     * @param observer The Observer to unregister.
     */
    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     * Obtain the current state of the Subject.
     *
     * @return The current state of the Subject.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Update the current state of the Subject.
     *
     * @param state The new state of the Subject.
     */
    public void setState(String state) {
        this.state = state;

        // State has been updated. Notify all observers
        this.notifyObservers();
    }

    /**
     * Notify all Observers of this entity that the entity has updated.
     */
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }
}
