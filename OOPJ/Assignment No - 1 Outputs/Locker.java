//Q.4
import java.util.Scanner;
class Locker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter locker number: ");
        int n = sc.nextInt();
		System.out.println((n%2==0) ? "Even locker number" : "Odd locker number");
		sc.close();
		
		}
	}