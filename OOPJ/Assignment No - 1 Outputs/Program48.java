import java.util.Scanner;
public class Program48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m = sc.nextInt();
        if (m >= 85) System.out.println("Grade: A");
        else if (m >= 70) {
            System.out.println("Grade: A" + (m >= 78 ? "−" : "+"));
        } else if (m >= 55) System.out.println("Grade: B");
        else if (m >= 40) System.out.println("Grade: C");
        else System.out.println("Fail");
        sc.close();
    }
}
