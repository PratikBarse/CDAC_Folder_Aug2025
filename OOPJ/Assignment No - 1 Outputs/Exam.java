Q.7
import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
		int y = sc.nextInt();
		if(y >= 35)System.out.println("Student has passed.");
		else System.out.println("Student has Failed.");
		sc.close();
		}
	}