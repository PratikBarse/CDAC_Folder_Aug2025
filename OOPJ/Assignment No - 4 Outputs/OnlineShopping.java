import java.util.Scanner;

class OnlineShopping{
public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		try{
			int quantity = sc.nextInt();
			int n = sc.nextInt();
			double[] prices = new double[n];
			for(int i = 0; i < n; i++) prices[i] = sc.nextDouble();
			int idx = sc.nextInt();
			
			if(quantity <= 0){
				
				throw new ArithmeticException("Invalid Exception");
			} 
			
			double total = quantity * prices[idx];
			System.out.println("Total = " + total);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception caught");
		}catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Array Index Exception");
		}finally{
		sc.close();
		}
}
}