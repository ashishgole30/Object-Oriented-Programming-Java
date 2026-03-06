public class Interface_vs_Abstract_Class {
    public static void main(String[] args) {
        // Interface vs Abstract Class

        /*
         * 1️⃣ Definition
         * Interface
         * An interface is a blueprint that contains method declarations only (mostly).
         * Classes implement an interface.
         * Example idea:
         * Device
         * |-- Fan
         * |-- AC
         * The interface tells what should be done, but not how.
         * 
         * Abstract Class
         * An abstract class is a partially implemented class.
         * It can contain:
         * abstract methods
         * normal methods
         * variables
         * constructors
         * Classes extend an abstract class.
         * Example:
         * Payment
         * |-- UPI
         * |-- CreditCard
         * 
         * 2️⃣ Core Concept
         * Interface
         * Used when different classes must follow the same behavior
         * Example:
         * Flyable
         * |-- Bird
         * |-- Airplane
         * Both must implement fly().
         * 
         * Abstract Class
         * Used when classes share some common code.
         * Example:
         * Animal
         * |-- Dog
         * |-- Cat
         * Common behavior:
         * eat()
         * sleep()
         * Different behavior:
         * makeSound()
         * 
         * 3️⃣ Syntax
         * Interface
         * interface Device {
         * void turnOn();
         * }
         * class Fan implements Device {
         * public void turnOn() {
         * System.out.println("Fan ON");
         * }
         * }
         * 
         * Abstract Class
         * abstract class Animal {
         * abstract void makeSound();
         * 
         * void sleep() {
         * System.out.println("Sleeping");
         * }
         * }
         * class Dog extends Animal {
         * void makeSound() {
         * System.out.println("Bark");
         * }
         * }
         * 
         * 4️⃣ Major Differences
         * | Feature | Interface | Abstract Class |
         * | -------------------- | --------------------- | ----------------- |
         * | Keyword used | `interface` | `abstract class` |
         * | Methods | Mostly abstract | Abstract + normal |
         * | Variables | `public static final` | Any type |
         * | Constructors | ❌ Not allowed | ✅ Allowed |
         * | Inheritance | `implements` | `extends` |
         * | Multiple inheritance | ✅ Allowed | ❌ Not allowed |
         * | Purpose | Define behavior | Share code |
         * 
         * 5️⃣ When To Use Which
         * Use Interface when
         * You want multiple unrelated classes to follow the same rule
         * Example:
         * Runnable
         * Serializable
         * Comparable
         * 
         * Use Abstract Class when
         * Classes share common code or fields
         * Example:
         * Vehicle
         * Animal
         * Payment
         */

        Cricket cricket = new Cricket();
        Football football = new Football();

        cricket.play();
        football.play();
        cricket.showGameType();
        football.showGameType();

    }
}

interface Playable {
    void play();
}

abstract class Game {
    void showGameType() {
        System.out.println("You are playing outdoor games");
    };
}

class Cricket extends Game implements Playable {
    @Override
    public void play() {
        System.out.println("You Are Playing Cricket!");
    }
}

class Football extends Game implements Playable {
    @Override
    public void play() {
        System.out.println("You Are Playing Football!");
    }
}