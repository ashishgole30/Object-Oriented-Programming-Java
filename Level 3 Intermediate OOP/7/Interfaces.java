public class Interfaces {
    public static void main(String[] args) {
        // Interfaces

        /*
         * Definition:
         * An Interface in Java is a blueprint of a class that contains abstract methods
         * and constants.
         * It is used to achieve:
         * Abstraction
         * Multiple inheritance
         * A class implements an interface and must provide the implementation of its
         * methods.
         * 
         * Concept:
         * Think of an interface like a contract / rule book.
         * Example:
         * Interface says:
         * Vehicle must have:
         * start()
         * stop()
         * Any class that implements it must follow the rule.
         * Example classes:
         * Car
         * Bike
         * Truck
         * All must define:
         * start()
         * stop()
         * 
         * Syntax:
         * Interface
         * interface InterfaceName {
         * void method1();
         * void method2();
         * }
         * Class implementing interface
         * class ClassName implements InterfaceName {
         * public void method1() {
         * // implementation
         * }
         * public void method2() {
         * // implementation
         * }
         * }
         * 
         * Important Rules:
         * Interface methods are public and abstract by default
         * Variables are public static final (constants)
         * Objects cannot be created for an interface
         * A class must implement all methods
         */

        Fan fan = new Fan();
        fan.turnOff();
        fan.turnOn();
    }
}

interface Device {
    void turnOn();

    void turnOff();
}

class Fan implements Device {
    public void turnOn() {
        System.out.println("Fan is ON");
    }

    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}