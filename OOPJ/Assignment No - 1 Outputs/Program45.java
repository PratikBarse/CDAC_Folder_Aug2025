import java.util.Scanner;
import java.util.Arrays;
public class Program45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers (comma or space separated): ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double[] arr = {a, b, c};
        Arrays.sort(arr);
        System.out.println("Ascending order: " + arr[0] + ", " + arr[1] + ", " + arr[2]);
        sc.close();
    }
}
