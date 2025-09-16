import java.util.Scanner;
public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter total classes held :");
		int total = sc.nextInt();
		System.out.println("Enter classes attended :");
		int attended = sc.nextInt();
		double perc =(total == 0) ? 0 :(attended * 100.0/ total);
		if (perc >= 75) System.out.println("Student is allowed to sit for the exam.");
        else System.out.println("Student is NOT allowed to sit for the exam.");
        sc.close();
	}
}
		