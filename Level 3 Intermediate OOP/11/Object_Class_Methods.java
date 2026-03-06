public class Object_Class_Methods {
    public static void main(String[] args) {
        // Object Class Methods (toString(), equals(), hashCode() – Basic)

        /*
         * 1️⃣ Definition
         * In Java, every class automatically extends the class Object.
         * Example:
         * class Student {
         * }
         * Actually becomes internally:
         * class Student extends Object {
         * }
         * Because of this, every class gets some built-in methods, such as:
         * toString()
         * equals()
         * hashCode()
         * These are called Object Class Methods.
         * 
         * 2️⃣ Core Concept
         * The Object class provides common behavior for all Java objects.
         * Most commonly used methods:
         * | Method | Purpose |
         * | ------------ | ------------------------------- |
         * | `toString()` | Convert object to readable text |
         * | `equals()` | Compare two objects |
         * | `hashCode()` | Generate hash value of object |
         * 
         * 3️⃣ toString() Method
         * Purpose
         * Returns a string representation of the object.
         * Example
         * class Student {
         * int id = 10;
         * }
         * Student s = new Student();
         * System.out.println(s);
         * Output (default):
         * Student@1b6d3586
         * This is not very useful, so we override it.
         * Overriding toString()
         * class Student {
         * int id = 10;
         * public String toString() {
         * return "Student ID = " + id;
         * }
         * }
         * Now:
         * Student s = new Student();
         * System.out.println(s);
         * Output
         * Student ID = 10
         * 
         * 4️⃣ equals() Method
         * Purpose
         * Compares two objects.
         * Default behavior:
         * Compares memory addresses
         * Example:
         * Student s1 = new Student();
         * Student s2 = new Student();
         * System.out.println(s1.equals(s2));
         * Output
         * false
         * Because they are different objects in memory.
         * Overriding equals()
         * class Student {
         * int id;
         * Student(int id) {
         * this.id = id;
         * public boolean equals(Object obj) {
         * Student s = (Student) obj;
         * return this.id == s.id;
         * }
         * }
         * Now:
         * Student s1 = new Student(10);
         * Student s2 = new Student(10);
         * System.out.println(s1.equals(s2));
         * Output
         * true
         * Because IDs are equal.
         * 
         * 5️⃣ hashCode() Method
         * Purpose
         * Returns a numeric hash value for the object.
         * Used heavily in:
         * HashMap
         * HashSet
         * HashTable
         * Example:
         * Student s = new Student(10);
         * System.out.println(s.hashCode());
         * Output:
         * random number like 345678
         * Usually when we override equals(), we also override hashCode().
         * Example:
         * public int hashCode() {
         * return id;
         * }
         */

        Mobile m1 = new Mobile("Samsung", 30000);
        Mobile m2 = new Mobile("Samsung", 25000);
        Mobile m3 = new Mobile("Apple", 90000);

        System.out.println(m1);

        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));

        System.out.println(m1.hashCode());
    }
}

class Mobile {
    String brand;
    double price;

    Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile Brand: " + brand + " Price: " + price;
    }

    @Override
    public boolean equals(Object obj) {

        Mobile m = (Mobile) obj;

        if (this.brand.equals(m.brand)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return brand.hashCode();
    }
}