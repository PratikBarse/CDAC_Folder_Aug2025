import java.util.Scanner;
public class Program36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers (space separated): ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double smallest = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
        System.out.println("Smallest number: " + smallest);
        sc.close();
    }
}
