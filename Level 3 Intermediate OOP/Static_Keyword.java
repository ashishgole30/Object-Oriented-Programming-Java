public class Static_Keyword {
    public static void main(String[] args) {
        // Static Keyword ( Variables, Methods, Blocks)
        /*
         * Definition / Concept
         * static is a keyword used to make a variable, method, or block belong to the
         * class, not to objects.
         * It means the member is shared among all objects of that class.
         * 
         * Types of static
         * Static Variable (Class Variable)
         * Shared by all objects
         * Memory allocated only once
         * 
         * Static Method
         * Belongs to class
         * Can access only static members directly
         * 
         * Static Block
         * Executes only once when class loads
         * Used for initialization
         */

        Employee e1 = new Employee("Mark");
        Employee e2 = new Employee("John");
        Employee e3 = new Employee("Jack");

        System.out.println("Before Changing Company Name:");
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        // Change company name
        // Static methods should be called using class name
        Employee.changeCompanyName();

        System.out.println("\nAfter Changing Company Name:");
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();

        // All objects (e1, e2, e3) will show the new company name.
        // Because companyName belongs to the class, not the object.
    }
}

class Employee {
    static String companyName = "Meta AI";

    String employeeName;

    Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    static void changeCompanyName() {
        companyName = "Not Meta AI";
    }

    void displayDetails() {
        System.out.println("Company Name:" + companyName + "\n" + "Employee Name:" + employeeName);
    }
}