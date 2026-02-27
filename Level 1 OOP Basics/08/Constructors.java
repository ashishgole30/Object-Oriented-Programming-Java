public class Constructors {
    // Constructors
    public static void main(String[] args) {
        /*
         * 🔹 1. Definition
         * A constructor is a special method used to initialize objects.
         * It runs automatically when an object is created.
         * 
         * 🔹 2. Theory
         * When you write:
         * Student s1 = new Student();
         * Java does 3 things:
         * Allocates memory in heap
         * Creates the object
         * Calls the constructor automatically
         * If you do not write a constructor, Java provides a default constructor.
         * 
         * 🔹 3. Concept
         * Think of constructor as:
         * “Object setup method”
         * It prepares the object when it is created.
         * Example:
         * If you create a Car, you may want:
         * brand
         * price
         * 
         * Instead of:
         * Car c1 = new Car();
         * c1.brand = "BMW";
         * c1.price = 50000;
         * 
         * You can directly do:
         * Car c1 = new Car("BMW", 50000);
         * Cleaner.
         * Safer.
         * Professional way.
         * 
         * 🔹 4. Rules of Constructor
         * ✔ Name must be same as class name
         * ✔ No return type (not even void)
         * ✔ Called automatically
         * ✔ Used to initialize instance variables
         * 
         * 🔹 5. Syntax
         * class ClassName {
         * ClassName() {
         * // constructor body
         * }
         * }
         * 
         * Parameterized Constructor
         * class ClassName {
         * ClassName(dataType variable) {
         * this.variable = variable;
         * }
         * }
         * 
         * 🔹 6. Types of Constructors
         * 
         * 1️⃣ Default Constructor
         * * No parameters.
         * class Student {
         * Student() {
         * System.out.println("Object Created");
         * }
         * }
         * 
         * 2️⃣ Parameterized Constructor
         * * Has parameters.
         * class Student {
         * String name;
         * Student(String name) {
         * this.name = name;
         * }
         * }
         * 
         * 🔹 7. Short Example
         * class Laptop {
         * String brand;
         * int ram;
         * 
         * Laptop(String brand, int ram) {
         * this.brand = brand;
         * this.ram = ram;
         * }
         * 
         * void display() {
         * System.out.println(brand + " - " + ram + "GB");
         * }
         * }
         * 
         * public class ConstructorDemo {
         * public static void main(String[] args) {
         * 
         * Laptop l1 = new Laptop("Lenovo", 8);
         * Laptop l2 = new Laptop("Asus", 16);
         * 
         * l1.display();
         * l2.display();
         * }
         * }
         * Output:
         * Lenovo - 8GB
         * Asus - 16GB
         * 
         * Why Constructors Are Important
         * Without constructor → object may remain partially initialized.
         * With constructor → object is ready immediately after creation.
         * Professional code always prefers constructor initialization.
         */

        // Inside Main Method

        // Object 1
        Employee emp1 = new Employee("John", 1, 1200.10);
        // Object 2
        Employee emp2 = new Employee("Snow", 2, 1300.1);

        // Calling display Method and Printind Details
        emp1.display();
        System.out.println("-------"); // Text Decoration
        emp2.display();
    }
}

// Class Employee
class Employee {
    // 3 Attributes
    String name;
    int id;
    double salary;

    // Parameterized Constructor
    Employee(String name, int id, double salary) {
        // this keyword
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method
    void display() {
        // Print Statements
        System.out.println("Employee name : " + name);
        System.out.println("Employee id : " + id);
        System.out.println("Employee salary : " + salary);
    }
}
