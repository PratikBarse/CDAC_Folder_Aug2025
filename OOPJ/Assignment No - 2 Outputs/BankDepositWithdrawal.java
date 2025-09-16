class BankAccount{
	String accountHolder;
	double balance;
	
	BankAccount(String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
		
	}
	
	
	void deposit(double amount){
		if (amount > 0)  balance += amount;
	}
	void withdrawl(double amount){
		if(amount > 0 && amount <= balance) balance -= amount;
	}
	 public String toString() {
            return "AccountHolder=" + accountHolder + ", Balance=" + balance;
        }

}





class BankDepositWithdrawal{
	public static void main(String args[]){
	
	BankAccount a1 = new BankAccount("Pratik", 7000);
	BankAccount a2 = new BankAccount("Ashish", 5000);
	
	a1.deposit(1500);
	a2.withdrawl(2000);
	
	System.out.println(a1);
		System.out.println(a2);
		
	}
}