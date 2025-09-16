import java.util.Scanner;
public class Program29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day type (1-Workday, 2-Weekend): ");
        int t = sc.nextInt();
        if (t == 1) System.out.println("It's a workday.");
        else if (t == 2) System.out.println("It's weekend. No work today.");
        else System.out.println("Invalid selection.");
        sc.close();
    }
}
