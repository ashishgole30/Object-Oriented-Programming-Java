public class Memory_Concept {
    public static void main(String[] args) {
        // 6. Memory Concept (Stack vs Heap – basic understanding)
        /*
         * 🔹 1. Theory
         * When you run a Java program, memory is divided mainly into:
         * Stack Memory
         * Heap Memory
         * Both are used differently.
         * Understanding this is VERY important because it explains:
         * How objects are created
         * How variables are stored
         * Why new keyword matters
         * How Java manages memory
         * 
         * 🔹 2. Concept (Very Simple Explanation)
         * 🟢 Stack Memory
         * Stores local variables
         * Stores method calls
         * Works in LIFO (Last In First Out) manner
         * Automatically cleared when method finishes
         * 👉 Every time a method runs, a new “stack frame” is created.
         * Example:
         * int x = 10;
         * Here, x is stored in stack.
         * 
         * 🔵 Heap Memory
         * Stores objects
         * Objects are created using new keyword
         * Shared across methods
         * Cleared by Garbage Collector
         * Example:
         * Student s1 = new Student();
         * Here:
         * s1 → stored in stack (reference variable)
         * new Student() → stored in heap
         * 
         * 🔹 3. Visual Understanding
         * Student s1 = new Student();
         * Stack:
         * s1 → (address)
         * Heap:
         * Student object (real data)
         * Stack stores the reference.
         * Heap stores the actual object.
         * 
         * 🔹 4. Types (Inside Memory Concept)
         * 1️⃣ Primitive Variables
         * * Primitive Example
         * int a = 5;
         * Stored directly in stack.
         * 2️⃣ Reference Variables
         * * Reference Example
         * Car c = new Car();
         * c → stack
         * 3️⃣ Objects
         * object → heap
         */

        // Book object (b1)
        Book b1 = new Book();

        // assigning attributes to book object (b1)
        b1.title = "Harry Potter";
        b1.price = 12.10;

        // refence variable (b2) assigned to b1 object
        Book b2 = b1;

        /// Changing price using reference variable
        b2.price = 12.11;

        // Print price using first reference
        System.out.println(b1.price);
    }
}

class Book {
    String title;
    double price;
}