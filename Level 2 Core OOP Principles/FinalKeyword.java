public class FinalKeyword {
    public static void main(String[] args) {
        // Final Keyword
        /*
         * ✅ Definition
         * final is a non-access modifier in Java used to restrict modification.
         * In simple words:
         * final means cannot be changed / cannot be overridden / cannot be inherited,
         * depending on where it is used.
         * 
         * ✅ Concept
         * final can be used with:
         * 1️⃣ Variables
         * 2️⃣ Methods
         * 3️⃣ Classes
         * Each behaves differently.
         * 
         * 1️⃣ Final Variable
         * If a variable is declared final, its value cannot be changed after
         * initialization.
         * Example:
         * final int age = 20;
         * age = 25; // Error
         * It becomes a constant.
         * 🔹 Final Instance Variable
         * If declared inside class:
         * class Student {
         * final int rollNumber;
         * Student(int rollNumber) {
         * this.rollNumber = rollNumber;
         * }
         * }
         * Value must be assigned once (either at declaration or in constructor).
         * 
         * 2️⃣ Final Method
         * If a method is declared final, it cannot be overridden by child class.
         * Example:
         * class Parent {
         * final void show() {
         * System.out.println("This cannot be overridden");
         * }
         * }
         * class Child extends Parent {
         * void show() { } // Error
         * }
         * 
         * 3️⃣ Final Class
         * If a class is declared final, it cannot be inherited.
         * Example:
         * final class Animal {
         * }
         * class Dog extends Animal { } // Error
         * 
         * Important Interview Points
         * ✔ final variable → constant
         * ✔ final method → prevents overriding
         * ✔ final class → prevents inheritance
         * ✔ Used for security & design control
         * ✔ String class is final in Java (cannot extend it)
         * 
         * Why Use final?
         * To prevent accidental modification
         * To secure business logic
         * To design immutable classes
         * 
         * To stop unwanted inheritance
         */

        SavingsAccount acc = new SavingsAccount(1);
        acc.displayAccountNumber();
        acc.calculateInterest();
    }
}

class Account {
    final int accountNumber;

    Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void displayAccountNumber() {
        System.out.println("Account Number : " + accountNumber);
    }
    // final void calculateInterest() {
    // System.out.println("Base interest calculation");
    // }

    void calculateInterest() {
        System.out.println("Base interest calculation");
    }
}

class SavingsAccount extends Account {
    // Must need a constrcutor using super keyword
    SavingsAccount(int accountNumber) {
        super(accountNumber);
    }

    // Cannot override a final method
    // @Override
    // void calculateInterest() {
    // System.out.println("Saving Account Interest Calculation");
    // }

    @Override
    void calculateInterest() {
        System.out.println("Saving Account Interest Calculation");
    }
}

// final classes cannot extend other classes
// final class Transaction extends Account {
// }
class Transaction extends Account {
    Transaction(int accountNumber) {
        super(accountNumber);
    }
}