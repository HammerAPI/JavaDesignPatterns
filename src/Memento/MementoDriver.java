package Memento;

import Memento.Interfaces.Originator;
import Memento.Interfaces.Caretaker;
import Memento.Implementation.ConcreteOriginator;
import Memento.Implementation.ConcreteCaretaker;

/**
 * Driver to demonstrate the Memento Design Pattern.
 *
 * @author Daniel Hammer
 * @version 2021-05-01
 */
public class MementoDriver {

    /** Constant for the number of states to generate and display. */
    private static final int NUM_STATES = 3;

    /**
     * Main method of execution.
     */
    public static void go() {
        // Create an Originator to generate saved states
        Originator<String> originator = new ConcreteOriginator();

        // Create a Caretaker to handle saving and restoring
        Caretaker<String> caretaker = new ConcreteCaretaker();

        System.out.println("\nSimulating the Originator doing work and saving states:");
        for (int i = 0; i < NUM_STATES; i++) {
            originator.setState("State #" + i);
            System.out.println("\tCurrent state of Originator: " + originator.getState());
            caretaker.addMemento(originator.generateSaveState());
        }

        // Display all states of the Originator held by the Caretaker
        System.out.println("\nCaretaker History:");
        for (int i = 0; i < NUM_STATES; i++) {
            System.out.println("\t" + caretaker.getMemento(i));
        }

        System.out.println("\nManually restoring a previous state:");
        originator.getSaveState(caretaker.getMemento(NUM_STATES / 2));
        System.out.println("\tCurrent state of Originator: " + originator.getState());
    }
}
