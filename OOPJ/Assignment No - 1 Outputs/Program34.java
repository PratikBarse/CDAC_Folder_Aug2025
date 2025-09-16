import java.util.Scanner;
public class Program34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println((age >= 18) ? "Eligible to vote" : "Not Eligible");
        sc.close();
    }
}
