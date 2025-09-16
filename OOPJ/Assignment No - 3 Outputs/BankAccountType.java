class BankAccount{
	int accountNumber;
	String accountHolder;
	double balance;
	
	BankAccount(int accountNumber, String accountHolder, double balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		
	}
	void displayBalance(){
		System.out.println(accountHolder + " -> " + "Balance = " + balance);
	}
	
}
class SavingAccount extends BankAccount{
	double interestRate;
	SavingAccount(int accountNumber, String accountHolder, double balance, double interestRate){
		super(accountNumber, accountHolder,balance);
		this.interestRate = interestRate;
	}
	void calculateInterest(){
		double interest = balance * (interestRate / 100);
		System.out.println(accountHolder + "-> Balance = " + balance +", Interest " + interest);
	}
	
}
class CurrentAccount extends BankAccount{
	double OverdraftLimit;
	CurrentAccount(int accountNumber, String accountHolder, double balance, double OverdraftLimit){
		super(accountNumber, accountHolder,balance);
		this.OverdraftLimit = OverdraftLimit;
	}
	void checkOverdraft(){
		System.out.println(accountHolder + " -> Balance=" + balance + ", Overdraft Limit=" + OverdraftLimit);
	}
	
}
class BankAccountType{
	public static void main(String args[]){
		SavingAccount s = new SavingAccount(101, "Pratik",5000,5);
		CurrentAccount c = new CurrentAccount(102,"Ashish",2000,1000);
		s.calculateInterest();
		c.checkOverdraft();
		
		
	}
}