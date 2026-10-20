class BankAccount{
    String accountHolderName;
    int accountNumber;
    double  balance;
    private static int totalBankAccounts = 0;

    public BankAccount(String accountHolderName, int accountNumber, double  balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalBankAccounts++;
    }

    public static int getTotalAccounts(){
        return totalBankAccounts;
    }
}
public class Task3 {
    public static void main(String[] args) {
        BankAccount bAccount1 = new BankAccount("Prahlad", 126548790, 1564.25);
        BankAccount bAccount2 = new BankAccount("Rohan Sharma", 156445698, 56746.5);
        BankAccount bAccount3 = new BankAccount("Payal Mishra", 5646653, 65);

        System.out.println("\n=============Fist Accunt holder details================\n");
        display(bAccount1);

        System.out.println("\n=============Second Accunt holder details================\n");
        display(bAccount2);

        System.out.println("\n=============Third Accunt holder details================\n");
        display(bAccount3);

        System.out.println("----------------------------------------");
        System.out.println("Total Account Created : " + BankAccount.getTotalAccounts());
        System.out.println("----------------------------------------");

    }

    public static void display(BankAccount bankAccount){
        System.out.println("Account Holder Name : " + bankAccount.accountHolderName);
        System.out.println("Account Number : " + bankAccount.accountNumber);
        System.out.println("Bank Balance : " + bankAccount.balance);
    }
}
