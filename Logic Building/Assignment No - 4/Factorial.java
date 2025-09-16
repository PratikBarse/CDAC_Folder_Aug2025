//Q.3
import java.util.Scanner;
	class Factorial{
		public static void main(String args []){
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" Enter a number : ");
			int N = sc.nextInt();
			  
			     long factorial = 1;
				  
			for( int i = 1; i <= N; i++){
				factorial = factorial*i;
			}
			
			System.out.println(" Factorial of " + N + " is " + factorial);
			
			sc.close();
		}
		
		
		
	}