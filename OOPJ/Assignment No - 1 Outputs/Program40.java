import java.util.Scanner;
public class Program40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amt = sc.nextDouble();
        double total = (amt > 1000) ? amt * 0.9 : amt;
        System.out.println("Total cost after discount: " + total);
        sc.close();
    }
}
