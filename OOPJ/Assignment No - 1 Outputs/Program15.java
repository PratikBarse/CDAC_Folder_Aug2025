import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int n = sc.nextInt();
        int a = n / 1000;
        int b = (n / 100) % 10;
        int c = (n / 10) % 10;
        int d = n % 10;
        if (a + b == c + d) System.out.println("Lucky number");
        else System.out.println("Not a lucky number");
        sc.close();
    }
}
