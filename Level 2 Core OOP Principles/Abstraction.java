public class Abstraction {
    public static void main(String[] args) {
        // Abstraction
        /*
         * ✅ Definition
         * Abstraction is the process of hiding implementation details and showing only
         * the essential features of an object.
         * In simple words:Show what the object does, hide how it does it.
         * 
         * ✅ Concept
         * User interacts with methods.
         * Internal working is hidden.
         * Achieved in Java using:
         * Abstract classes
         * Interfaces
         * 
         * Real-life Example
         * When you drive a car:
         * You press accelerator.
         * You don’t know how engine internally works.
         * That’s abstraction.
         * 
         * ✅ Types in Java
         * 
         * 1️⃣ Abstract Class
         * Can have abstract methods (without body)
         * Can have normal methods
         * Uses abstract keyword
         * Supports partial abstraction
         * 
         * 2️⃣ Interface
         * All methods are abstract (until Java 8 default methods)
         * Used for full abstraction
         * Supports multiple inheritance
         */

        // Parent reference, child object (Runtime Polymorphism)
        Payment payment;

        // Credit Card Payment
        payment = new CreditCardPayment();
        payment.paymentStatus();
        payment.pay(2000);

        System.out.println("------------------");

        // UPI Payment
        payment = new UPIPayment();
        payment.paymentStatus();
        payment.pay(1500);

    }
}

abstract class Payment {

    abstract void pay(double amount);

    void paymentStatus() {
        System.out.println("Payment Processing");
    }
}

class CreditCardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Credit Card Amount:" + amount);
    }
}

class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("UPI Amount:" + amount);
    }
}

/*
 * An abstract method cannot have a body.
 * Correct rule:
 * Abstract method = declaration only, no { }
 */