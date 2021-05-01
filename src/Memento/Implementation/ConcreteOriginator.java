package Memento.Implementation;

import Memento.Interfaces.Originator;
import Memento.Interfaces.Memento;

/**
 * Originator Class.
 *
 * Saves snapshots of its state as Mementos. Can restore state from a Memento.
 *
 * @author Daniel Hammer
 * @version 2021-05-01
 */
public class ConcreteOriginator implements Originator<String> {
    /** Current state(s) of the object. */
    private String state;

    /**
     * Sets the current state of this object.
     *
     * @param state The state to set.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the current state of this object.
     *
     * @return The current state of the object.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Generates a new Memento containing the current state of this object.
     *
     * @return A new Memento containing the state.
     */
    public Memento generateSaveState() {
        return new ConcreteMemento(state);
    }

    /**
     * Updates the state of the object given a Memento.
     *
     * @param mem The Memento from which to retrieve the state.
     */
    public void getSaveState(Memento mem) {
        this.state = (String) mem.getState();
    }
}
