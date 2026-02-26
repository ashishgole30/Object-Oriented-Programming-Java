public class Class_And_Object {
    public static void main(String[] args) {

        // 2. Class and Object

        /*
         * What is a Class?
         * A class is a blueprint or template used to create objects.
         * It defines:
         * Variables (data)
         * Methods (behavior)
         * Example:
         * If Car is a class,
         * then it may contain:
         * color
         * speed
         * brand
         * start() method
         * stop() method
         * But class itself is just a design.
         * It does not occupy memory until an object is created.
         */

        /*
         * What is an Object?
         * An object is a real-world instance of a class.
         * It:
         * Occupies memory
         * Has its own data
         * Can call methods
         * Example:
         * Car car1 = new Car();
         * Here:
         * Car → class
         * car1 → object
         * new → allocates memory in heap
         */

        /*
         * Concept
         * Think like this:
         * Class = Design of a house
         * Object = Actual house built using that design
         * You can build multiple houses (objects) from the same design (class).
         */

        /*
         * Basic Structure of a Class
         * class ClassName {
         * // variables (attributes)
         * // methods (functions)
         * }
         */

        /*
         * Creating an Object
         * ClassName objectName = new ClassName();
         */

        Mobile mobileOne = new Mobile();
        Mobile mobileTwo = new Mobile();

        mobileOne.setDetails("Apple", 1000.25);
        mobileTwo.setDetails("Samsung", 666.66);

        mobileOne.displayDetails();
        mobileTwo.displayDetails();

    }
}

class Mobile {
    String brand;
    double price;

    void setDetails(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);

    }
}
