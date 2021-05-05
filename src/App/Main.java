package App;

import Memento.MementoDriver;
import Singleton.SingletonDriver;
import Observer.ObserverDriver;

/**
 * Driver Class.
 *
 * @author Daniel Hammer
 * @version 2021-04-28
 */
public class Main {
    /**
     * Main method.
     *
     * @param args List of arguments supplied by executor.
     */
    public static void main(String[] args) {

        // Check args
        if (args.length < 1) {
            usage();
            System.exit(1);
        }

        // Run the driver for every arg supplied
        for (String arg : args) {
            switch (arg.toLowerCase()) {

                case "memento": memento();
                                break;

                case "singleton": singleton();
                                break;

                case "observer": observer();
                                break;

                case "all": memento();
                            singleton();
                            observer();
                            break;

                default: usage();
                         break;
            }
        }
    }

    /**
     * Displays a usage message.
     */
    public static void usage() {
        System.out.println("\nPlease supply at least one design pattern to showcase.");
        System.out.println("\nImplemented design patterns are: "
            + "Memento, "
            + "Singleton, "
            + "Observer");
    }

    /**
     * Executes the Memento driver.
     */
    public static void memento() {
        System.out.println("\n------------- Executing Memento Driver -------------");
        MementoDriver driver = new MementoDriver();
        driver.go();
        System.out.println("\n------------- Memento Driver Complete --------------");
    }

    /**
     * Executes the Singleton driver.
     */
    public static void singleton() {
        System.out.println("\n------------ Executing Singleton Driver ------------");
        SingletonDriver driver = new SingletonDriver();
        driver.go();
        System.out.println("\n------------ Singleton Driver Complete -------------");
    }

    /**
     * Executes the Observer driver.
     */
    public static void observer() {
        System.out.println("\n------------ Executing Observer Driver -------------");
        ObserverDriver driver = new ObserverDriver();
        driver.go();
        System.out.println("\n------------ Observer Driver Complete --------------");
    }
}
