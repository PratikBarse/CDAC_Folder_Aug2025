import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum number: ");
        int n = sc.nextInt();

        // Upper part of the pattern
        for (int i = 1; i <= n; i++) {
            // Print i with '*'
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = n; i >= 2; i--) {
            // Print i with '*'
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(i - 1);
                if (j < i - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
