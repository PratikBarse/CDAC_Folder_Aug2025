import java.util.Scanner;
public class Program32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        String res = (n > 0) ? "Number is Positive" : (n < 0) ? "Number is Negative" : "Number is Zero";
        System.out.println(res);
        sc.close();
    }
}
