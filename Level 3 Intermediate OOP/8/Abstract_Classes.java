public class Abstract_Classes {
    public static void main(String[] args) {
        // Abstract Classes

        /*
         * Definition:
         * An abstract class is a class that cannot be instantiated (cannot create
         * objects) and is meant to be extended by other classes.
         * It can contain:
         * Abstract methods (methods without body)
         * Normal methods (methods with body)
         * Variables
         * Constructors
         * 
         * Concept:
         * Think of an abstract class as a blueprint.
         * Example:
         * Animal is a general concept.
         * Animals can eat and sleep, but the sound they make differs.
         * So we create:
         * Animal
         * |
         * |--- Dog
         * |--- Cat
         * Animal defines common behavior, but specific classes implement details.
         * 
         * Important Rules:
         * Abstract class is declared using:
         * abstract class ClassName
         * Abstract methods must be declared using:
         * abstract void methodName();
         * A class that extends an abstract class must implement all abstract
         * methods.
         * You cannot create object of abstract class
         * Not allowed
         * Animal a = new Animal();
         * 
         * Syntax:
         * abstract class Animal {
         * abstract void makeSound(); // abstract method
         * void sleep() { // normal method
         * System.out.println("Animal sleeping");
         * }
         * }
         * class Dog extends Animal {
         * void makeSound() {
         * System.out.println("Dog barks");
         * }
         * }
         * 
         * | Abstract Class | Child Classes |
         * | -------------- | ----------------- |
         * | Animal | Dog, Cat |
         * | Vehicle | Car, Bike |
         * | Shape | Circle, Rectangle |
         * 
         */

        CreditCard card = new CreditCard();
        UPI upi = new UPI();

        card.showMessage();
        card.makePayment();
        System.out.println("--------------------------------------");
        upi.showMessage();
        upi.makePayment();
    }
}

abstract class Payment {
    abstract void makePayment();

    void showMessage() {
        System.out.println("Processing Payment");
    }
}

class CreditCard extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment done using Credit Card");
    }
}

class UPI extends Payment {
    @Override
    void makePayment() {
        System.out.println("Payment done using UPI");
    }
}
