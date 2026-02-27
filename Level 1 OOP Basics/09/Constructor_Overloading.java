public class Constructor_Overloading {
    public static void main(String[] args) {

        // Constructor Overloading

        /*
         * 🔹 1. Definition
         * Constructor Overloading means having multiple constructors in the same class
         * with different parameter lists.
         * Same constructor name
         * Different parameters
         * 
         * 🔹 2. Theory
         * We already know:
         * Constructor name = Class name
         * Used to initialize objects
         * Now imagine:
         * Sometimes you want to create an object with:
         * Only name
         * Or name + age
         * Or name + age + salary
         * Instead of writing different classes,
         * we create multiple constructors inside the same class.
         * This is called Constructor Overloading.
         * 
         * 🔹 3. Concept
         * Think of it like:
         * One class → Multiple ways to create object.
         * Example:
         * Student s1 = new Student();
         * Student s2 = new Student("John");
         * Student s3 = new Student("John", 20);
         * Same class.
         * Different ways of initializing.
         * Java decides which constructor to call based on arguments.
         * This is called Compile-Time Polymorphism
         * 
         * 🔹 4. Types (Based on Parameters)
         * Constructor overloading works by changing:
         * 1️⃣ Number of parameters
         * 2️⃣ Type of parameters
         * 3️⃣ Order of parameters
         * ✔ Example 1 – Different Number of Parameters
         * Student()
         * Student(String name)
         * Student(String name, int age)
         * ✔ Example 2 – Different Data Type
         * Student(int id)
         * Student(String name)
         * Only changing return type is NOT overloading.
         * Constructors don’t even have return type.
         * 
         * 🔹 5. Syntax
         * class ClassName {
         * ClassName() {
         * // constructor 1
         * }
         * ClassName(dataType var1) {
         * // constructor 2
         * }
         * ClassName(dataType var1, dataType var2) {
         * // constructor 3
         * }
         * }
         * 
         * 🔹 6. Short Example
         * class Product {
         * String name;
         * double price;
         * 
         * // Default constructor
         * Product() {
         * name = "Unknown";
         * price = 0.0;
         * }
         * 
         * // One parameter constructor
         * Product(String name) {
         * this.name = name;
         * this.price = 0.0;
         * }
         * 
         * // Two parameter constructor
         * Product(String name, double price) {
         * this.name = name;
         * this.price = price;
         * }
         * 
         * void display() {
         * System.out.println(name + " - " + price);
         * }
         * }
         * 
         * public class OverloadingDemo {
         * public static void main(String[] args) {
         * 
         * Product p1 = new Product();
         * Product p2 = new Product("Laptop");
         * Product p3 = new Product("Phone", 50000);
         * 
         * p1.display();
         * p2.display();
         * p3.display();
         * }
         * }
         * 
         * How Java Decides Which Constructor to Call
         * Based on:
         * Number of arguments
         * Type of arguments
         * This happens at compile time.
         * 
         */

        // Inside Main Method

        // Object 1
        Book b1 = new Book();
        // Object 2
        Book b2 = new Book("Geronimo Stilton");
        // Object 3
        Book b3 = new Book("Geronimo Stilton", 7.99, "Thea Stilton");

        // Calling display Method
        b1.display();
        b2.display();
        b3.display();
    }
}

// class Book
class Book {
    // Attributes
    String title;
    double price;
    String author;

    // Default Constructor
    Book() {
        // Assigning directly
        title = "Unknown";
        price = 0;
        author = "Unknown";
    }

    // Constructor With Title Only
    Book(String title) {
        // this Keyword
        price = 0;
        author = "Unknown";
        this.title = title;
    }

    // Constructor With Title,Price,Author
    Book(String title, double price, String author) {
        // this Keyword
        this.title = title;
        this.price = price;
        this.author = author;
    }

    // Method display
    void display() {
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
        System.out.println("Author : " + author);
    }
}
