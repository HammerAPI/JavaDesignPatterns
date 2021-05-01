package Memento.Interfaces;

/**
 * Memento to represent a saved state.
 */
public interface Memento<T> {
    /**
     * Retrieves the state(s) stored in this Memento.
     * 
     * @return The internal state stored in this Memento.
     */
    public T getState();
}
