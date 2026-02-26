public class Creating_Multiple_Objects {
    public static void main(String[] args) {

        // 5. Creating Multiple Objects

        /*
         * Definition:
         * Creating multiple objects means creating more than one instance of a class,
         * where each object has its own separate data (state) but shares the same class
         * structure.
         * 
         * Concept:
         * A class is a blueprint.
         * From one blueprint, you can create multiple objects.
         * Example:
         * Class → Student
         * Objects → student1, student2, student3
         * Each object:
         * Has its own attribute values
         * Exists separately in memory
         * Can call the same methods
         * Important Understanding
         * When you write:
         * Student s1 = new Student();
         * Student s2 = new Student();
         * Two different objects are created in heap memory.
         * Even though both are created from same class,
         * their data is stored separately.
         * 
         * Creating Multiple Objects:
         * 
         * 1️⃣ Manually Creating Multiple Objects
         * Student s1 = new Student();
         * Student s2 = new Student();
         * Student s3 = new Student();
         * 
         * 2️⃣ Using Array of Objects
         * Student[] students = new Student[3];
         * 
         * Syntax:
         * Creating Multiple Objects Normally
         * ClassName obj1 = new ClassName();
         * ClassName obj2 = new ClassName();
         * 
         * Short Example:
         * class Student {
         * String name;
         * int marks;
         * 
         * void display() {
         * System.out.println(name + " - " + marks);
         * }
         * }
         * 
         * public class Main {
         * public static void main(String[] args) {
         * 
         * Student s1 = new Student();
         * Student s2 = new Student();
         * 
         * s1.name = "Ashish";
         * s1.marks = 90;
         * 
         * s2.name = "Rahul";
         * s2.marks = 85;
         * 
         * s1.display();
         * s2.display();
         * }
         * }
         * 
         * Output:
         * 
         * Ashish - 90
         * Rahul - 85
         */

        Laptop lp1 = new Laptop();
        Laptop lp2 = new Laptop();
        Laptop lp3 = new Laptop();

        lp1.setDetails("Lenovo", 8, 1200);
        lp2.setDetails("Asus", 16, 2200);
        lp3.setDetails("HP", 32, 3200);

        lp1.displayDetails();
        lp2.displayDetails();
        lp3.displayDetails();
    }
}

class Laptop {
    String brand;
    int ram;
    double price;

    void setDetails(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    void displayDetails() {
        System.out.println(
                "This Laptop is of the brand " + brand + ". It has " + ram + "GB of Ram. Its price is " + price + "$");
    }
}
