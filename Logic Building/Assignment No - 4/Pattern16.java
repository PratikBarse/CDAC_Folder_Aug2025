import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to print numbers with '*'
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {  // Add '*' only between numbers
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
