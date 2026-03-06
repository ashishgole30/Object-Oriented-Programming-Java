public class instanceof_Operator {
    public static void main(String[] args) {
        // Instanceof Operator
        /*
         * Definition:
         * instanceof is used to check whether an object belongs to a particular class
         * or not
         * It returns true or false.
         * Useful when:
         * Working with inheritance
         * Working with polymorphism
         * Before type casting
         * 
         * Concept
         * When a parent reference holds a child object, we may want to check the actual
         * object type at runtime.
         * instanceof helps us verify the object type safely.
         * Example situation:
         * Animal a = new Dog();
         * We can check:
         * a instanceof Dog → true
         * a instanceof Animal → true
         * 
         * Syntax
         * object instanceof ClassName
         * Example:
         * if(obj instanceof Dog){
         * // code
         * }
         * Returns:
         * true → object belongs to that class
         * false → object does not belong
         */
        Vehicle v1 = new Car();
        Vehicle v2 = new Truck();

        if (v1 instanceof Car) {
            System.out.println("This is a Car");
        }
        if (v1 instanceof Bike) {
            System.out.println("This is a Bike");
        }
        if (v2 instanceof Truck) {
            System.out.println("This is a Truck");
        }
    }
}

class Vehicle {
}

class Car extends Vehicle {
}

class Bike extends Vehicle {
}

class Truck extends Vehicle {
}