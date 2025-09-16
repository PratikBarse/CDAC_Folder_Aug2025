//Q.11
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage marks: ");
		int p = sc.nextInt();
		if (p >= 90) System.out.println("Grade: A+");
		else if (p >= 76) System.out.println("Grade: A");
        else if (p >= 66) System.out.println("Grade: B+");
        else if (p >= 51) System.out.println("Grade: B");
        else if (p >= 36) System.out.println("Grade: C");
        else System.out.println("Fail");
        sc.close();
	}
}