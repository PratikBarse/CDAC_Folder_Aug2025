import java.util.Scanner;
public class Program41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;
        while (temp != 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        System.out.println((sum == n) ? n + " is an Armstrong number" : n + " is not an Armstrong number");
        sc.close();
    }
}
