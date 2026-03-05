public class Object_as_Method_Parameter {
    public static void main(String[] args) {
        // Object as Method Parameter
        /*
         * Definition / Concept
         * Passing an object to a method means sending the reference of that object as
         * an argument.
         * 
         * The method can:
         * Access object variables
         * Call object methods
         * Modify object data
         * In Java, object references are passed (pass-by-value of reference).
         * 
         * Types
         * No special types, but two common uses:
         * Using object data inside another method
         * Modifying object state through method
         */
        Car car1 = new Car("BMW", 120);
        Car car2 = new Car("AUDI", 140);

        Race r = new Race();
        r.startRace(car1, car2);

        System.out.println("New Speed :" + car1.speed);
        System.out.println("New Speed :" + car2.speed);
    }
}

class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
}

class Race {
    void startRace(Car car1, Car car2) {
        System.out.println("---------------------------------");
        System.out.println("Car Brand : " + car1.brand);
        System.out.println("Car Speed :" + car1.speed);
        car1.speed = car1.speed + 20;
        System.out.println("Updated Car Speed :" + car1.speed);
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("Car Brand : " + car2.brand);
        System.out.println("Car Speed :" + car2.speed);
        car2.speed = car2.speed + 20;
        System.out.println("Updated Car Speed :" + car2.speed);
        System.out.println("---------------------------------");
    }
}