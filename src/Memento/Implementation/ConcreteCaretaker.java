package Memento.Implementation;

import Memento.Interfaces.Memento;
import Memento.Interfaces.Caretaker;

import java.util.List;
import java.util.ArrayList;

/**
 * Caretaker class.
 *
 * Stores a list of previous saved states and handles the "when" and "why"
 * to save and restore a state.
 *
 * @author Daniel Hammer
 * @version 2021-05-01
 */
public class ConcreteCaretaker implements Caretaker<String> {
    /** List of saved states. */
    private List<Memento> mementos;

    /**
     * Constructor for the Caretaker.
     */
    public ConcreteCaretaker() {
        this.mementos = new ArrayList<Memento>();
    }

    /**
     * Adds a Memento to the list of saved states.
     *
     * @param mem A Memento to add to the saved states.
     */
    public void addMemento(Memento mem) {
        mementos.add(mem);
    }

    /**
     * Retrieves a Memento from the given index.
     *
     * @param index The index of the save state to retrieve.
     * @return A Memento from the Caretaker's history.
     */
    public Memento getMemento(int index) {
        Memento mem = null;
        try {
            mem = mementos.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Index " + index + " out of bounds for list of length " + this.mementos.size());
        } finally {
            return mem;
        }
    }
}
