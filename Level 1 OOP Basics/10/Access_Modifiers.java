public class Access_Modifiers {
    public static void main(String[] args) {
        // Access Modifiers (public, private,default)

        // NOTE - Protected Access Modifier will be covered in another level
        // NOTE - Non Access Modifier will be covered in another level

        /*
         * 🔹 1. Definition
         * Access Modifiers are keywords used to control:
         * Who can access variables, methods, and classes.
         * They provide data security and encapsulation.
         * 
         * 🔹 2. Theory
         * In real world:
         * You don’t want everyone accessing everything.
         * Some data should be private.
         * 
         * Some should be public.
         * Java provides 4 access levels.
         * (public,private,default,protected)
         * 
         * 🔹 3. Types of Access Modifiers
         * 1️⃣ private
         * Accessible only inside the same class.
         * Cannot be accessed outside the class.
         * Not accessible in same package.
         * Not accessible in subclass.
         * Not accessible in other packages.
         * Most restrictive access level.
         * Mainly used for data hiding.
         * 
         * 2️⃣ Default (No Modifier)
         * When you do NOT write any access modifier.
         * Accessible inside:
         * Same class
         * Same package
         * Not accessible outside the package.
         * Not accessible in subclass if subclass is in different package.
         * Also called package-private.
         * 
         * 3️⃣ protected
         * Accessible inside:
         * Same class
         * Same package
         * Subclasses (even in different packages)
         * Not accessible in non-subclass classes outside the package.
         * Mainly used in inheritance.
         * 
         * 4️⃣ public
         * 
         * Accessible everywhere:
         * Same class
         * Same package
         * Subclass
         * Other packages
         * Least restrictive access level.
         * 
         * (NOTE - For Level 1, focus mainly on:
         * private
         * public
         * default
         * We will properly use protected in inheritance topic.)
         * 
         * 🔹 4. Concept
         * 🔒 private
         * Accessible only inside same class
         * Most secure
         * 🌍 public
         * Accessible everywhere
         * 📦 default (no keyword)
         * Accessible only inside same package
         * 
         * private → default → protected → public
         * Security decreases as you move right.
         * 
         * 🔹 5. Syntax
         * 
         * 1. Variable
         * private int age;
         * public String name;
         * int salary; // default
         * 
         * 2. Method
         * public void display() {}
         * private void calculate() {}
         * 
         * 3. Class
         * public class Student {}
         * class Employee {} // default
         * 
         * (NOTE- You cannot make a top-level class private)
         * 
         * 🔹 6. Why Access Modifiers Are Important
         * Without access control:
         * Anyone can modify data.
         * Example:
         * account.balance = -1000000;
         * Very dangerous.
         * Instead:
         * Make variable private and provide controlled methods.
         * This leads to:
         * Encapsulation
         * 
         * 🔹 7. Short Example
         * class BankAccount {
         * 
         * private double balance; // hidden data
         * 
         * public void deposit(double amount) {
         * balance = balance - amount;
         * }
         * 
         * public void displayBalance() {
         * System.out.println("Balance: " + balance);
         * }
         * }
         * 
         * public class AccessDemo {
         * public static void main(String[] args) {
         * 
         * BankAccount acc = new BankAccount();
         * 
         * acc.deposit(1000);
         * acc.displayBalance();
         * 
         * // acc.balance = 5000; ERROR (private)
         * }
         * }
         * What Happens Here?
         * balance is private
         * Cannot access directly
         * Must use public method
         * This protects data.
         */

        // Inside Main Method

        // Object
        Student student = new Student();
        // Calling setDetails Method
        student.setDetails("John", 45, 75.55);

        // This is will not work as int age is private
        // student.age = 1;
        student.display();
    }
}

// Class Student
class Student {
    // Private Attributes
    private String name;
    private int age;
    private double marks;

    // Method setDetails
    public void setDetails(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Method display()
    public void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Marks:" + marks);
    }
}