public class Attributes {
    public static void main(String[] args) {
        // 3. Attributes (Instance Variables)

        /*
         * Definition
         * Attributes are variables declared inside a class that represent the
         * properties or data of an object.
         * They are also called:
         * Instance variables
         * Data members
         * Fields
         */

        /*
         * Concept
         * Attributes define the state of an object.
         * Example:
         * If we have a Car class, its attributes might be:
         * color
         * speed
         * brand
         * These values can be different for every object.
         */

        Employee employeeOne = new Employee();
        Employee employeeTwo = new Employee();

        employeeOne.name = "Ashish";
        employeeOne.id = 1;
        employeeOne.salary = 1200;
        employeeOne.isPermanent = true;

        employeeTwo.name = "Rahul";
        employeeTwo.id = 2;
        employeeTwo.salary = 1300;
        employeeTwo.isPermanent = false;

        System.out.println("Employee Name:" + employeeOne.name + "\n" + "Employee Id:" + employeeOne.id + "\n" +
                "Employee Salary:" + employeeOne.salary + "\n" + "Is Employee Permanent?:" + employeeOne.isPermanent);

        System.out.println("-----------------------");

        System.out.println("Employee Name:" + employeeTwo.name + "\n" + "Employee Id:" + employeeTwo.id + "\n" +
                "Employee Salary:" + employeeTwo.salary + "\n" + "Is Employee Permanent?:" + employeeTwo.isPermanent);
    }

}

class Employee {
    String name;
    int id;
    double salary;
    boolean isPermanent;
}
