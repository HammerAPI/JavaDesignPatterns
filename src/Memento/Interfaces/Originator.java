package Memento.Interfaces;

/**
 * Models an Originator, which saves snapshots of its state as Mementos.
 */
public interface Originator<T> {

    /**
     * Sets the current state of this object.
     *
     * @param state The state to set.
     */
    public void setState(T state);

    /**
     * Gets the current state of this object.
     *
     * @return The current state of the object.
     */
    public T getState();

    /**
     * Generates a new Memento containing the current state of this object.
     *
     * @return A new Memento containing the state.
     */
    public Memento generateSaveState();

    /**
     * Updates the state of the object given a Memento.
     *
     * @param mem The Memento from which to retrieve the state.
     */
    public void getSaveState(Memento mem);
}
