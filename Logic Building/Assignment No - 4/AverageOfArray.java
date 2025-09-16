//Q.10

import java.util.Scanner;
import java.util.Arrays;

	class AverageOfArray{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int [] number = new int[5];
		
		System.out.println(" Enter 5 integer: ");
			
			for(int i = 0; i < 5; i++){
			 number[i] = sc.nextInt();
			}
			
			int sum = 0;
			
			for(int num : number){
				sum = sum + num;
			}
			
			double average = (double) sum / number.length;
			 System.out.println("The average of the numbers is: " + average);

        sc.close();
    }
}