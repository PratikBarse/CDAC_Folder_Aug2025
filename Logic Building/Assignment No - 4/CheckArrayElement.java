//Q.13

	
import java.util.Scanner;
import java.util.Arrays;

public class CheckArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Integer[] numbers = new Integer[5];

        
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        if (Arrays.asList(numbers).contains(target)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}
