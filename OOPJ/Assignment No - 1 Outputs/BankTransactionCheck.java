//Q.3
import java.util.Scanner;
class BankTransactionCheck{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter transaction amount: ");
		double amt = sc.nextDouble();
		if(amt > 0)System.out.println("Deposit transaction.(Positive)");
		else if(amt < 0)System.out.println("Withdrawl transaction.(Negative) ");
		else System.out.println("No Transaction");
		sc.close();
		}
	}
		