//Q.7

import java.util.Scanner;
class SumOfAllArrayElement{
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int [5];
		System.out.println(" Enter 5 integer: ");
		for (int i = 0; i < 5; i++){
			numbers[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int num : numbers ){
		
			sum = sum + num;
		}
		System.out.println("The sum of all number is :" + sum);
		sc.close();
	}
	
	
	
}