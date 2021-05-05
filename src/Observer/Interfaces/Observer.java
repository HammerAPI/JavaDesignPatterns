package Observer.Interfaces;

/**
 * Models an Observer, or entity that listens to a Subject.
 *
 * @author Daniel Hammer
 * @version 2021-05-05
 */
public interface Observer {

    /**
     * Notifies this Observer that its subject has been updated.
     */
    public void update();
}
