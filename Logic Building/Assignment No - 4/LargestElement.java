//Q.9

import java.util.Scanner;
import java.util.Arrays;

	class LargestElement{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter 5 integer: ");
		int [] number = new int[5];
			
			for(int i = 0; i < 5; i++){
			 number[i] = sc.nextInt();
			}
			 
			 int max = Arrays.stream(number).max().getAsInt();
			
			System.out.println("The Largest Element is : " + max);
			sc.close();
		}
	}