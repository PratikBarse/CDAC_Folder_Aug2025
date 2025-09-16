//Q.11


import java.util.Scanner;
	class CountPositiveNegative{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
			System.out.println(" Enter 6 integer :");
			int []number = new int[6];
			
			
			for(int i = 0; i < 6; i++){
				number[i] = sc.nextInt();
			}
			
			int positivecount = 0; 
			int negativecount = 0;
			for(int num : number){
				if(num > 0  ){
					positivecount++;
					
				}
				else if (num < 0){
					negativecount++;
				}
				
			}
			
			
			
				System.out.println( "Positive Number : " + positivecount);
				System.out.println( "Negative Number : " + negativecount);
		}
	
	}