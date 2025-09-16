import java.util.Scanner;
	class PrintNumber{
		public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int N = sc.nextInt();
		
		for(int i =1; i <= N; i++){
			System.out.print(i);
			if( i < N){
				System.out.print(" ");
			}
			
		}
		sc.close();
		}
	}