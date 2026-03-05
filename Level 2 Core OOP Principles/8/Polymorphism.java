public class Polymorphism {
    public static void main(String[] args) {
        // 8.Polymorphism
        /*
         * Polymorphism means "many forms".
         * In Java, polymorphism allows one reference type to behave differently
         * depending on the object it refers to.
         * It is achieved in two ways:
         * Compile-time Polymorphism (Method Overloading)
         * Runtime Polymorphism (Method Overriding)
         * Polymorphism increases flexibility and supports dynamic behavior.
         */

        Employee employee;
        employee = new FullTimeEmployee();
        employee.calculateSalary();
        employee = new PartTimeEmployee();
        employee.calculateSalary();
    }
}

abstract class Employee {
    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Salary is : 1000$");
    }
}

class PartTimeEmployee extends Employee {
    @Override
    void calculateSalary() {
        System.out.println("Salary is : 600$");
    }
}