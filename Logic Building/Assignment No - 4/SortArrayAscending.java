//Q.12


import java.util.Scanner;
import java.util.Arrays;
	class SortArrayAscending{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 5 integer :");
			int [] number = new int[5];
			
			for( int i = 0; i < 5; i++){
			number[i] = sc.nextInt();
			}
			
			Arrays.sort(number);
			System.out.print("Sorted array : ");
			
			for( int num : number ){
				System.out.print(num + " ");
			
			sc.close();
		}
	}
}