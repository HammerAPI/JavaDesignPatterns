package Memento.Implementation;

import Memento.Interfaces.Memento;

/**
 * Memento Class.
 *
 * Represents a saved state.
 *
 * @author Daniel Hammer
 * @version 2021-05-01
 */
public class ConcreteMemento implements Memento<String> {

    /** The state(s) being saved. */
    private String state;
    
    /**
     * Constructor for a new Memento.
     *
     * @param state The state(s) to store in this Memento.
     */
    public ConcreteMemento(String state) {
        this.state = state;
    }

    /**
     * Retrieves the state(s) stored in this Memento.
     *
     * @return The internal state of this Memento.
     */
    public String getState() {
        return state;
    }

    /**
     * Override of toString in java.lang.Object.
     *
     * @return A string representation of this Memento.
     */
    @Override
    public String toString() {
        return this.state.toString();
    }
}
