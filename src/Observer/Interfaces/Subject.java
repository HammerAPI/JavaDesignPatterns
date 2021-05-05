package Observer.Interfaces;

/**
 * Models a Subject, or entity being observed.
 *
 * @author Daniel Hammer
 * @version 2021-05-05
 */
public interface Subject<T> {

    /**
     * Register an Observer to listen to this Subject.
     *
     * @param observer The Observer to register.
     */
    public void register(Observer observer);

    /**
     * Unregister an Observer to stop listen to this Subject.
     *
     * @param observer The Observer to unregister.
     */
    public void unregister(Observer observer);

    /**
     * Obtain the current state of the Subject.
     *
     * @return The current state of the Subject.
     */
    public T getState();

    /**
     * Update the current state of the Subject.
     *
     * @param state The new state of the Subject.
     */
    public void setState(T state);

    /**
     * Notify all Observers of this entity that the entity has updated.
     */
    public void notifyObservers();
}
