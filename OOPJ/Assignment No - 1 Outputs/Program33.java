import java.util.Scanner;
public class Program33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println((n % 2 == 0) ? "Number is Even" : "Number is Odd");
        sc.close();
    }
}
