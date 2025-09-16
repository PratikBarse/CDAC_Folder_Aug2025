import java.util.Scanner;

public class PaymentProccesing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String amountStr = sc.nextLine().trim();
		int add = Integer.parseInt(sc.nextLine().trim());
		try{
			int amount = Integer.parseInt(amountStr);
			System.out.println(amount + " + " + add + " = " + (amount + add));
		}
		catch (NumberFormatException e){
			System.out.println("Invalid amount Format");
		}
		finally{
		}
	}
}