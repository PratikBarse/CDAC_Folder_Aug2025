class BankAccount{

	String accountHolder;
	double balance;
	
	BankAccount(String accountHolder, double balance){
		this.accountHolder = accountHolder;
		this.balance = balance;
		
	}
	
	
	
	double getBalance(){
	return balance;
	}
	
	
	 void setBalance(double balance)
	 {
	 this.balance = balance;
	 }
	 
	 
	 public String toString(){
	 
		return "AccountHolder= " + accountHolder + ", Balance= " + balance ;
	 }
	 
}



class BankAccountBasicInfo{
	public static void main(String args){
	BankAccount acc = new BankAccount("Pratik", 10000);
	System.out.println(acc);
	
	
	}

}