import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            int odd = 1;  // Start from first odd number

            // Inner loop to print odd numbers with '*'
            for (int j = 1; j <= i; j++) {
                System.out.print(odd);
                if (j < i) {  // Add '*' only between numbers
                    System.out.print("*");
                }
                odd += 2; // Move to next odd number
            }
            System.out.println();
        }

        sc.close();
    }
}
