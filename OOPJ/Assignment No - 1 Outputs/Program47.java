import java.util.Scanner;
public class Program47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        boolean aEven = a % 2 == 0, bEven = b % 2 == 0;
        if (aEven && bEven) System.out.println("Both numbers are even");
        else if (!aEven && !bEven) System.out.println("Both numbers are odd");
        else System.out.println("Numbers are mixed (one even, one odd)");
        sc.close();
    }
}
