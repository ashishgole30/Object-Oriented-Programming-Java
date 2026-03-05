public class Runtime_Polymorphism {
    public static void main(String[] args) {
        // Runtime Polymorphism (Method Overriding)
        /*
         * Runtime polymorphism happens when a child class overrides a parent class
         * method.
         * The method call is resolved at runtime based on the object.
         * Also called:
         * Dynamic Binding
         * Late Binding
         * Achieved using:
         * Inheritance
         * Method overriding
         * Parent reference pointing to child object
         */
        Vehicle vehicle;

        vehicle = new Car();
        vehicle.start();

        vehicle = new Bike();
        vehicle.start();
    }
}

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("The Car is starting");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("The Bike is starting");
    }
}