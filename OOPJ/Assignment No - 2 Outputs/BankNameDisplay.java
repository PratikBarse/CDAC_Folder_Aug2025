class BankAccount{
	static String bankName = "CDAC Bank";
	String accountHolder;
	double balance;
	
	BankAccount(String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
		
	}
	
	
	static void displayBankName(){
	System.out.println("Bank Name: " + bankName);
	
	
	}
	
	}
class BankNameDisplay{
public static void main(String args []){


BankAccount.displayBankName();
BankAccount acc = new BankAccount("Pratik",10000 );

System.out.println("Account created successfully.");


}
}