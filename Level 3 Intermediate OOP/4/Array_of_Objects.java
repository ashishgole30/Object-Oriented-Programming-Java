public class Array_of_Objects {
    public static void main(String[] args) {
        // Array of Objects

        /*
         * Definition / Concept
         * An Array of Objects is an array where each element stores a reference to an
         * object instead of primitive values.
         * Instead of storing numbers like:
         * int[] arr = {1,2,3}
         * we store objects like:
         * Student[] students
         * Each index of the array points to a separate object in heap memory.
         * So it allows us to manage multiple objects of the same class efficiently.
         * Example use cases:
         * List of students
         * List of employees
         * List of products
         * 
         * Syntax
         * ClassName[] arrayName = new ClassName[size];
         * 
         * Types / Ways to Create
         * 1️⃣ Declaration then object creation
         * Student[] students = new Student[3];
         * students[0] = new Student("A", 80);
         * students[1] = new Student("B", 90);
         * students[2] = new Student("C", 70);
         * 
         * 2️⃣ Direct initialization
         * Student[] students = {
         * new Student("A",80),
         * new Student("B",90),
         * new Student("C",70)
         * };
         */

        Book[] myArray = new Book[3];
        myArray[0] = new Book("Java Basics", 12.25);
        myArray[1] = new Book("Python Guide", 14.25);
        myArray[2] = new Book("Data Structures", 15.25);

        for (int i = 0; i < myArray.length; i++) {
            myArray[i].display();
            System.out.println("---------------------------------");
        }
    }
}

class Book {
    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Book Title : " + title);
        System.out.println("Book Price : " + price);
    }
}