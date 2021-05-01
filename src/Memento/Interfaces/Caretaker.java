package Memento.Interfaces;

/**
 * Caretaker class.
 */
public interface Caretaker<T> {
    /**
     * Adds a Memento to the list of saved states.
     *
     * @param mem A Memento to add to the saved states.
     */
    public void addMemento(Memento mem);

    /**
     * Retrieves a Memento from the given index.
     *
     * @param index The index of the save state to retrieve.
     * @return A Memento from the Caretaker's history.
     */
    public Memento getMemento(int index);
}
