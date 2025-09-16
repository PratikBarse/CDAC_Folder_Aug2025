//Q.8
import java.util.Scanner;
public class Discount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total purchase amount: ");
        double amt = sc.nextDouble();
        double finalCost = (amt > 1000) ? amt * 0.9 : amt;
        System.out.println("Final cost after discount: " + finalCost);
        sc.close();
    }
}
