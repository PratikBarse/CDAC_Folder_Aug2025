class BankAccount{
	private double balance;
	public void deposit(double amount){
		if(amount > 0){
			balance = balance + amount;
		}
		else{
			System.out.println("Invalid deposit amount");
		}
	}
	public void withdraw(double amount){
		if(amount > 0 && amount <= balance ){
			balance = balance - amount;
		}
		else {
			System.out.println("Insufficient Balance or Invalid Balance");
		}
		
	}
	
		public double getBalance(){
			return balance;
		}
	
	
	public static void main(String args[]){
		BankAccount acc = new BankAccount();
		acc.deposit(5000);
		acc.withdraw(2000);
		System.out.println("Updated Balance = " + acc.getBalance());
		
		
	}
}
