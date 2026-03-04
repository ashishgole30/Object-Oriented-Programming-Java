// Public class static vs instance members
public class Static_vs_Instance_Members {
    // Main method
    public static void main(String[] args) {
        // Static vs Instance Members
        /*
         * 🔸 Static Members
         * Belong to the class
         * Shared among all objects
         * Created once when class loads
         * Access using ClassName.member
         * 
         * 🔸 Instance Members
         * Belong to the object
         * Each object has its own copy
         * Created when object is created
         * Access using object reference
         * 
         * Types
         * Both can be:
         * Variables
         * Methods
         * (Constructors cannot be static)
         */

        // Three objects
        BankAccount b1 = new BankAccount("John", 1200.25);
        BankAccount b2 = new BankAccount("Jack", 1230.25);
        BankAccount b3 = new BankAccount("Jill", 1240.25);

        // Calling deposit method for each object
        b1.deposit(1200.65);
        b2.deposit(1200.45);
        b3.deposit(1200.35);

        // Calling display details method for each object
        b1.displayDetails();
        System.out.println("-----------");
        b2.displayDetails();
        System.out.println("-----------");
        b3.displayDetails();
        System.out.println("-----------");
    }
}

// class BankAccount
class BankAccount {

    static String bankName = "My Bank 123"; // static variable
    static int totalAccounts = 0; // static variable
    String accountHolderName; // instance variable
    double balance; // instance variable

    // constructor
    BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    // Method
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Method
    void displayDetails() {
        System.out.println("Bank Name:" + BankAccount.bankName);
        System.out.println("Total Number Of Accounts:" + BankAccount.totalAccounts);
        System.out.println("Account Holder Name:" + accountHolderName);
        System.out.println("Balance:" + balance);
    }
}