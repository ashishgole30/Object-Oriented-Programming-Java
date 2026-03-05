public class Composition {
    public static void main(String[] args) {
        // Composition

        /*
         * Definition
         * Composition is a relationship where one class contains another class as a
         * part of it, and the contained object cannot exist independently of the parent
         * object.
         * In simple words:
         * One object owns another object.
         * 
         * Example:
         * Car HAS-A Engine
         * House HAS-A Room
         * Human HAS-A Heart
         * If the parent object is destroyed, the contained object also gets destroyed.
         * 
         * ✅ Concept
         * In Composition:
         * One class creates and controls the lifetime of another object.
         * The contained object does not exist separately.
         * It represents a strong relationship.
         * Example idea:
         * Car
         * └── Engine
         * The engine belongs only to that car.
         */

        Laptop l1 = new Laptop("Dell", 5000);
        Laptop l2 = new Laptop("HP", 4500);

        l1.displayLaptop();
        l2.displayLaptop();

    }
}

class Battery {
    int capacity;

    Battery(int capacity) {
        this.capacity = capacity;
    }

    void showBattery() {
        System.out.println("Battery Capacity : " + capacity);
    }
}

class Laptop {
    String brand;
    Battery battery;

    Laptop(String brand, int capacity) {
        this.brand = brand;
        battery = new Battery(capacity); // Composition
    }

    void displayLaptop() {
        System.out.println("Laptop Brand : " + brand);
        battery.showBattery();
    }
}