import java.util.Scanner;
public class Program39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double sal = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int yrs = sc.nextInt();
        double bonus = (yrs > 5) ? sal * 0.05 : 0.0;
        System.out.println("Bonus: " + (int)bonus);
        sc.close();
    }
}
