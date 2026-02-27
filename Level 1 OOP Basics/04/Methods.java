public class Methods {
    public static void main(String[] args) {

        // 4. Methods

        /*
         * Definition
         * A method is a block of code defined inside a class that performs a specific
         * task.
         * It represents the behavior of an object.
         * If attributes define the state,
         * methods define the actions.
         */

        /*
         * Concept
         * Think real-world:
         * Class → Dog
         * Attributes → name, breed, age
         * Methods → bark(), eat(), sleep()
         * So:
         * Data = What object HAS
         * Method = What object DOES
         * Methods help:
         * Organize logic
         * Reuse code
         * Improve readability
         */

        /*
         * Basic Syntax
         * returnType methodName(parameters) {
         * // body
         * }
         */

        /*
         * Example:
         * void greet() {
         * System.out.println("Hello!");
         * }
         */

        /*
         * Calling a Method
         * objectName.methodName();
         */

        /*
         * Example:
         * Student s1 = new Student();
         * s1.greet();
         */

        /*
         * Types of Methods
         * 
         * 1️⃣ Based on Return Type
         * 
         * a) Void Method (returns nothing)
         * void display() {
         * System.out.println("Hi");
         * }
         * 
         * b) Non-void Method (returns value)
         * int add(int a, int b) {
         * return a + b;
         * }
         * 
         * 2️⃣ Based on Parameters
         * 
         * a) No Parameters
         * void show() {
         * System.out.println("Hello");
         * }
         * 
         * b) With Parameters
         * void showName(String name) {
         * System.out.println(name);
         * }
         */

        BankAccount account = new BankAccount();

        account.accountHolder = "John";
        account.deposit(100);
        account.withdraw(50);
        account.displayBalance();
    }
}

class BankAccount {
    String accountHolder;
    double balance;

    void deposit(double money) {
        balance = balance + money;
    }

    void withdraw(double money) {
        if (balance >= money) {
            balance = balance - money;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
