import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    private LocalDateTime createdAt;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.createdAt = LocalDateTime.now().minusYears(2);
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() { return accountHolderName; }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() { return accountNumber; }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() { return balance; }

    public LocalDateTime getCreatedAt() { return createdAt; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\n[DEPOSIT TRANSACTION]");
            System.out.printf("Credited Amount       : Rs. %.2f%n", amount);
            System.out.printf("Updated Balance       : Rs. %.2f%n", balance);
        }
    }

    public void withdraw(double amount) {
        System.out.println("\n[WITHDRAWAL TRANSACTION]");
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.printf("Debited Amount        : Rs. %.2f%n", amount);
            System.out.printf("Remaining Balance     : Rs. %.2f%n", balance);
        } else {
            System.out.println("Transaction Failed    : Insufficient Balance!");
        }
    }
}

abstract class Account {
    abstract void calculateInterest();

    public void welcomeMessage(String name, int aNumber) {
        System.out.println("==================================================");
        System.out.println("               WELCOME TO JAVA BANK               ");
        System.out.println("==================================================");
        System.out.println("Account Holder Name   : " + name);
        System.out.println("Account Number        : " + aNumber);
        System.out.println("--------------------------------------------------");
    }
}

class SavingsAccount extends Account {
    private BankAccount bAccount;

    public SavingsAccount(BankAccount bAccount) {
        this.bAccount = bAccount;
    }

    @Override
    public void calculateInterest() {
        double time = ChronoUnit.YEARS.between(bAccount.getCreatedAt(), LocalDateTime.now());
        double rate = 9.1;
        double interest = (bAccount.getBalance() * time * rate) / 100.0;
        bAccount.setBalance(bAccount.getBalance() + interest);

        System.out.println("\n[INTEREST CALCULATION - SAVINGS ACCOUNT]");
        System.out.printf("Time Period           : %.0f Years%n", time);
        System.out.printf("Interest Rate         : %.1f%%%n", rate);
        System.out.printf("Interest Earned       : Rs. %.2f%n", interest);
        System.out.println("--------------------------------------------------");
        System.out.printf("FINAL TOTAL BALANCE   : Rs. %.2f%n", bAccount.getBalance());
        System.out.println("==================================================");
    }
}

public class Task6 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Prahlad", 15320497, 0);
        SavingsAccount s = new SavingsAccount(bankAccount);

        // Display Account Details
        s.welcomeMessage(bankAccount.getAccountHolderName(), bankAccount.getAccountNumber());
        System.out.printf("Initial Balance       : Rs. %.2f%n", bankAccount.getBalance());

        //Deposit & Withdraw Operations
        bankAccount.deposit(5000);
        bankAccount.withdraw(100);

        //Calculate Interest
        s.calculateInterest();
    }
}