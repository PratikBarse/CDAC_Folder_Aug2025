//Q.14

import java.util.Scanner;
import java.util.Arrays;

	class IndexElementArray{
	public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
		int []number = new int[5];
		System.out.println("Enter 5 integer :");
		for( int i = 0; i < 5; i++){
			number[i] = sc.nextInt();
		}
		 System.out.print("Enter the number to search: ");
        int target = sc.nextInt();
  Arrays.sort(number);
		int index = Arrays.binarySearch(number , target);
		
		if (index >= 0){
		System.out.println("The number " + target + " is found at index " + index);
		}
		else {
            System.out.println("Not Found");
        }

        sc.close();
    
	}
	}
	
	
	