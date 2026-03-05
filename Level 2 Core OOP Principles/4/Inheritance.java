public class Inheritance {
    // Inheritance
    public static void main(String[] args) {
        /*
         * ✅ Definition
         * 
         * Inheritance is the mechanism in Java by which one class acquires the
         * properties and behaviors of another class.
         * In simple words:
         * One class reuses the code of another class.
         * 
         * ✅ Concept
         * Parent class → also called Super class
         * Child class → also called Sub class
         * Uses extends keyword
         * Promotes code reusability
         * Supports method overriding
         * Builds "is-a" relationship
         * Example:
         * Dog is-a Animal
         * Car is-a Vehicle
         * 
         * ✅ Types of Inheritance in Java
         * 
         * 1️⃣ Single Inheritance
         * One child inherits one parent.
         * Animal
         * ↓
         * Dog
         * 
         * 2️⃣ Multilevel Inheritance
         * Child inherits from a class that already inherits another class.
         * Animal
         * ↓
         * Mammal
         * ↓
         * Dog
         * 
         * 3️⃣ Hierarchical Inheritance
         * Multiple children inherit from one parent.
         * Animal
         * / \
         * Dog Cat
         * Java does NOT support multiple inheritance with classes
         * (but supports it using interfaces)
         */

        Manager m = new Manager("John", 1000, 120);

        m.displayDetails();
        m.calculateTotalSalary();

    }
}

class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;

    }

    void displayDetails() {
        System.out.println("Name:" + name);
        System.out.println("Salary:" + salary);
    }

    public double getSalary() {
        return salary;

    }
}

class Manager extends Employee {

    private double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void calculateTotalSalary() {
        double totalsalary = getSalary() + bonus;
        System.out.println("Total Salary:" + totalsalary);
    }
}
