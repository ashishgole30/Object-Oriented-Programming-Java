public class Super_Keyword {
    public static void main(String[] args) {
        // Super Keyword
        /*
         * ✅ Definition
         * super is a keyword in Java used to refer to the parent class object.
         * It is mainly used to:
         * 
         * 1️⃣ Access parent class variables
         * 2️⃣ Call parent class methods
         * 3️⃣ Call parent class constructor
         * 
         * ✅ Concept
         * When a child class inherits from a parent, sometimes:
         * Parent and child have same variable names
         * Parent and child have same method names
         * You want to call parent constructor
         * That’s when super is used.
         * 
         * 🧠 Important Rules
         * ✔ Used only inside child class
         * ✔ super() calls parent constructor
         * ✔ If not written, Java automatically calls default parent constructor
         * ✔ Must be first statement in constructor
         * ✔ Cannot use super inside static methods
         */

        Car caroject = new Car(100, 120);
        caroject.showSpeed();
    }
}

class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    void showSpeed() {
        System.out.println("Vehicle Speed : " + speed);
    }
}

class Car extends Vehicle {
    int speed;

    Car(int vehiclespeed, int carspeed) {
        super(vehiclespeed);
        this.speed = carspeed;
    }

    @Override
    void showSpeed() {
        super.showSpeed();
        System.out.println("Car Speed : " + speed);
    }
}