import java.util.Scanner;
public class Program35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m = sc.nextInt();
        System.out.println((m >= 35) ? "Pass" : "Fail");
        sc.close();
    }
}
