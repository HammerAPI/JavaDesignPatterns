package App;

import Memento.MementoDriver;

/**
 * Driver Class.
 *
 * @author Daniel Hammer
 * @version 2021-04-28 21:21:59
 */
public class Main {
    /**
     * Main
     *
     * @param args List of arguments supplied by executor.
     */
    public static void main(String[] args) {
        //this.memento();
        MementoDriver driver = new MementoDriver();
        driver.go();
    }

    public static void memento() {
        MementoDriver driver = new MementoDriver();
        driver.go();
    }
}
