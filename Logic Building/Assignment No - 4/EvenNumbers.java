//w
wQ.4
import java.util.Scanner;
	class EvenNumbers{
		public static void main(String args []){
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" Enter a number : ");
			int N = sc.nextInt();
			  
			     
				  
			for( int i = 1; i <= N; i++){
				if(i % 2 == 0){
			System.out.print(i + " ");
			}
			
			}
			
			sc.close();
		}
		
		
		
	}