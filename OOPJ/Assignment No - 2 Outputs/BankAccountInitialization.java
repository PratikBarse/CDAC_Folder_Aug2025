class BankAccount {
    String name;
    double balance;
    static double interestRate; 

    static {
        interestRate = 4.0;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }

   
    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

 
    @Override
    public String toString() {
        return "Name=" + name + ", Balance=" + balance;
    }

  
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setBalance(double balance) { this.balance = balance; }
    public double getBalance() { return balance; }

    public static double getInterestRate() { return interestRate; }
}

class BankAccountInitialization {
    public static void main(String args[]) {
        BankAccount c1 = new BankAccount("Rohit", 5000);
        BankAccount c2 = new BankAccount("Priya", 15000);

        System.out.println("Account1: " + c1);
        System.out.println("Account2: " + c2);

        // Show interest rate
        System.out.println("Bank Interest Rate: " + BankAccount.getInterestRate() + "%");
    }
}
