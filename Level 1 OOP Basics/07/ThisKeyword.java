public class ThisKeyword {
    public static void main(String[] args) {

        // "this" keyword

        /*
         * 🔹 1. Definition
         * this is a keyword in Java that refers to the current object.
         * It is used inside a class to refer to:
         * Current object's variables
         * Current object's methods
         * Current object itself
         * 
         * 🔹 2. Theory (Why It Is Needed)
         * When method parameters have the same name as instance variables, Java gets
         * confused.
         * Example:
         * class Student {
         * String name;
         * void setName(String name) {
         * name = name; // ❌ Problem
         * }
         * }
         * 
         * Here:
         * name (parameter)
         * name (instance variable)
         * Both have same name.
         * So Java assigns parameter to itself.
         * The instance variable does NOT change.
         * 
         * 🔹 3. Concept
         * Think of this as:
         * “This object's variable”
         * So:
         * this.name = name;
         * Means:
         * Left side → instance variable
         * Right side → parameter
         * Now it works correctly.
         * 
         * 🔹 4. Syntax
         * Basic usage:
         * this.variableName
         * Inside constructor or method:
         * this.variableName = parameterName;
         * 
         * 🔹 5. Where this is Used
         * 
         * 1️⃣ To Differentiate Instance Variable from Parameter
         * class Student {
         * String name;
         * void setName(String name) {
         * this.name = name;
         * }
         * }
         * 
         * 2️⃣ To Call Current Class Method
         * this.display();
         * 
         * 3️⃣ To Call Another Constructor (Constructor Chaining)
         * this(10, "Ashish");
         *
         * 🔹 6. Short Example
         * class Car {
         * String brand;
         * double price;
         * 
         * void setDetails(String brand, double price) {
         * this.brand = brand;
         * this.price = price;
         * }
         * 
         * void display() {
         * System.out.println(brand + " - " + price);
         * }
         * }
         * 
         * public class ThisDemo {
         * public static void main(String[] args) {
         * Car c1 = new Car();
         * c1.setDetails("BMW", 50000);
         * c1.display();
         * }
         * }
         * Output:
         * BMW - 50000.0
         * 
         * Why this Is Important
         * Without this:
         * brand = brand;
         * Parameter assigns to itself.
         * Instance variable remains null.
         * With this:
         * this.brand = brand;
         * Now instance variable gets correct value.
         */

        Student student = new Student();

        student.setDetails("John", 12);
        student.display();

    }
}

class Student {
    String name;
    int age;

    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name + "\n" + "Age : " + age);
    }
}