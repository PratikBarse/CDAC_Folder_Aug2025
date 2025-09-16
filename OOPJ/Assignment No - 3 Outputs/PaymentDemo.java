abstract class Payment{	
	abstract void Pay();
}
class CreditCardPayment extends Payment{
	String cardNumber;
	double amount;
	CreditCardPayment(String cardNumber,double amount){
		this.cardNumber = cardNumber;
		this.amount = amount;
	
	}
	void Pay(){
		System.out.println("Payment via Credit Card = " + cardNumber + "->" + "Rs." + amount  + "Paid" );
	}
}
class UPIPayment extends Payment{
	String upiId;
	double amount;
	
	UPIPayment(String upiId ,double amount){
		this.upiId = upiId;
		this.amount = amount;
		
	}
		void Pay(){
			System.out.println("Payment via UPI = " + upiId + " ->" + "Rs. " + amount +"Paid" );
			
		}
}
public class PaymentDemo{
	public static void main(String args []){
		Payment p1 = new CreditCardPayment("123456785466564",5000);
		Payment p2 = new UPIPayment("pratik@upi",2000);
		p1.Pay();
		p2.Pay();
	}
}