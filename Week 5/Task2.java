interface Payment{
    public void pay(double amount);
    public void showPaymentDetails();
}

class UPIPayment implements Payment{
    private String upiId = "xyz@ybl";
    private double amount;
    
    @Override 
    public void pay(double amount){
        this.amount = amount;
        System.out.println("Payment of Rs."+amount+ " successful via UPI ID "+ upiId);
    }

    @Override 
    public void showPaymentDetails(){
        System.out.println("--- UPI Payment Receipt ---");
        System.out.println("Transaction Method: UPI");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount Paid: " + amount);
    }
}

class CardPayment implements Payment{
    private Long cardNumber = 1345647849846L;
    private double amount;

    @Override 
    public void pay(double amount){
        this.amount = amount;
        System.out.println("Payment of Rs."+amount+ " successful via Debit Card " + cardNumber);
    }

    @Override 
    public void showPaymentDetails(){
        System.out.println("--- Card Payment Receipt ---");
        System.out.println("Transaction Method: Debit Card");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Amount Paid: " + amount);
    }
}

public class Task2 {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        upi.pay(100);
        upi.showPaymentDetails();
        System.out.println("\n");
        CardPayment card = new CardPayment();
        card.pay(500);
        card.showPaymentDetails();
    }
}
 