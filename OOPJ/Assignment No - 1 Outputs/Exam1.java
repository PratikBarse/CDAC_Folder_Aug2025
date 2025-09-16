//Q.12
import java.util.Scanner;
public class Exam1 {
    public static void3main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Classes held: ");
        int total = sc.nextInt();
        System.out.print("Classes attended: ");
        int attended = sc.nextInt();
        System.out.print("Medical cause (Y/N): ");
		char ch = sc.next().toUpperCase().charAt(0);
		double perc = (total == 0) ? 0 :(attended * 100.0 / total);
		if (perc >= 75 || ch == 'Y') System.out.println("Student is allowed to sit for the exam.");
        else System.out.println("Student is NOT allowed to sit for the exam.");
        sc.close();
		
		}
}