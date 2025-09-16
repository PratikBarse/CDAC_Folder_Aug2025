abstract class Payment {
    abstract void pay();
}

class CreditCardPayment extends Payment {
    String cardNumber;
    double amount;

    CreditCardPayment(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    @Override
    void pay() {
        System.out.println("Payment via Credit Card " + cardNumber + " → Rs. " + amount + " Paid");
    }
}

class UPIPayment extends Payment {
    String upiId;
    double amount;

    UPIPayment(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    @Override
    void pay() {
        System.out.println("Payment via UPI " + upiId + " → Rs. " + amount + " Paid");
    }
}

public class PaymentProcessDemo {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment("1234567890123456", 5000);
        p.pay();

        p = new UPIPayment("rahul@upi", 2000);
        p.pay();
    }
}
