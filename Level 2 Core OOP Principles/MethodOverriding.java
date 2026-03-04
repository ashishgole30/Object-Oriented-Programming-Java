public class MethodOverriding {
    public static void main(String[] args) {

        // Method Overriding

        /*
         * ✅ Definition
         * Method Overriding occurs when a child class provides its own implementation
         * of a method that is already defined in the parent class.
         * In simple words:
         * Child class redefines a parent class method.
         * 
         * ✅ Concept
         * Overriding happens when:
         * Two classes have inheritance relationship
         * Same method name
         * Same parameters (method signature)
         * Same return type (or covariant return type)
         * It enables runtime polymorphism.
         * 
         * Why We Need It?
         * Because sometimes child behavior should be different.
         * Example:
         * Animal makes sound
         * Dog barks
         * Cat meows
         * All are animals, but behavior differs.
         * 
         * ✅ Rules of Method Overriding (VERY IMPORTANT 🔥)
         * ✔ Must have inheritance (extends)
         * ✔ Method name must be same
         * ✔ Parameters must be same
         * ✔ Return type must be same (or subtype)
         * ✔ Access modifier cannot be more restrictive
         * ✔ Cannot override final method
         * ✔ Cannot override static method (it is method hiding)
         * ✔ Use @Override annotation (best practice)
         * 
         * Overloading → Same class → Different parameters
         * Overriding → Parent-child → Same method signature
         */

        Bank b1 = new Bank();
        Bank b2 = new SBI();
        Bank b3 = new HDFC();

        b1.getInterestRate();
        b2.getInterestRate();
        b3.getInterestRate();

    }
}

class Bank {
    void getInterestRate() {
        System.out.println("Base interest rate is 5%");
    }
}

class SBI extends Bank {
    @Override
    void getInterestRate() {
        System.out.println("SBI interest rate is 7%");
    }
}

class HDFC extends Bank {
    @Override
    void getInterestRate() {
        System.out.println("HDFC interest rate is 8%");
    }
}