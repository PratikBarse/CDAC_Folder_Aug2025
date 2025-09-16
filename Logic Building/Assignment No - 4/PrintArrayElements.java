//Q.6




import java.util.Scanner;
class PrintArrayElements{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the array size:");
		int arr = sc.nextInt();
		int array[] = new int[arr];
	System.out.println("Enter the values:");
	
	
	for(int i = 0; i < arr; i++){
		array[i] = sc.nextInt();
	}
	
	for(int i = 0; i < arr; i++){
		System.out.println(array[i] + " ");
	}
	}		
}