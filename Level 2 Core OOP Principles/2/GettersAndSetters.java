public class GettersAndSetters {
    public static void main(String[] args) {
        // 2.Getters and Setters
        /*
         * ✅ Definition
         * Getters and Setters are public methods used to access (get) and modify (set)
         * private variables of a class.
         * They are used to implement encapsulation.
         * 
         * ✅ Concept
         * Since variables are private:
         * We cannot access them directly.
         * We use getters to read values.
         * We use setters to update values safely.
         * Setters allow us to apply validation logic before assigning values.
         * They provide controlled access to data.
         * 
         * ✅ Types
         * There are no official types, but conceptually:
         * 
         * 1️⃣ Simple Getter & Setter
         * → Just return and assign value.
         * 
         * 2️⃣ Validated Setter
         * → Setter checks condition before assigning value.
         * 
         * 3️⃣ Read-only Property
         * → Only getter, no setter.
         * 
         * 4️⃣ Write-only Property
         * → Only setter, no getter (rare).
         */

        Student student = new Student(1);

        student.setName("Ashish");
        System.out.println("Name:" + student.getName());

        student.setMarks(3);
        System.out.println("Marks:" + student.getMarks());
    }
}

class Student {
    private String name;
    private int marks;
    private int rollNumber;

    Student(int rollnumber) {
        this.rollNumber = rollnumber;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty");
        }
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Marks must be between 0 and 100");
        } else {
            this.marks = marks;
        }
    }

    public int getMarks() {
        return marks;
    }
}

/*
 * NOTE -
 * Each variable should have its own getter and setter method.
 * Setters Should NOT Return Values
 * Setters should return void.
 * Getters Should RETURN, Not Print
 * Method Type : Getter , Return Type :Returns variable type, Purpose : Read
 * data using return statement.
 * Method Type : Setter , Return Type : void, Purpose : Modify data
 * Always check null first.
 */