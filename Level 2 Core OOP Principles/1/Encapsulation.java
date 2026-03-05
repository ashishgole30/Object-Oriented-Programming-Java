// 1.Encapsulation
/*
 * ✅ Definition
 * Encapsulation is the process of wrapping data (variables) and methods
 * (functions) into a single unit (class) and restricting direct access to the
 * data.
 * 
 * ✅ Concept
 * Data members are made private.
 * Access is provided through public methods (getters & setters).
 * Prevents unauthorized modification of data.
 * Provides data hiding and better control.
 * Think of it like a capsule — data + methods packed together safely.
 * 
 * ✅ Types
 * There are no formal types, but conceptually:
 * Data Encapsulation → Hiding variables using private.
 * Method Encapsulation → Controlling access to methods
 * 
 *  NOTES -
 *  A getter should:
   Not take parameters
   Return the actual private variable

Your methods are default access.
For proper encapsulation they should be: public
Encapsulation = private data + public methods.

Why do we make balance private instead of public?
We make balance private to ensure data hiding and prevent direct unauthorized modification from outside the class.
 This allows controlled access through methods where we can apply validation and business logic.
 To protect data integrity and control how the balance is modified.
 data hiding, security, validation, integrity.
 */
public class Encapsulation {
    public static void main(String[] args) {
        BankAccount bankacc = new BankAccount(123);

        // cannot me modified due to encapsualtion
        // bankacc.balance = 12233l;
        bankacc.deposit(1600);
        bankacc.withdraw(50);

        System.out.println("Balance: " + bankacc.getBalance());

    }
}

class BankAccount {

    private int accountNumber;
    private double balance;

    BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Ammount Successfully Deposited");
        } else {
            System.out.println("Invalid deposit amount");
        }

        return balance;
    }

    public double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount cannot be negative or zero");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Amount Successfully withdrawn");
        }
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}
