import java.util.Scanner;
public class Program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        double g = (a > b) ? a : b;
        System.out.println("Greatest number: " + g);
        sc.close();
    }
}
