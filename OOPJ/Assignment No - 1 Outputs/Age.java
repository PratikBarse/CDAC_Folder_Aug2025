//Q.12
import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Friend 1: ");
        int a = sc.nextInt();
        System.out.print("Enter age of Friend 2: ");
        int b = sc.nextInt();
        System.out.print("Enter age of Friend 3: ");
        int c = sc.nextInt();
		int oldest = Math.max(a, Math.max(b,c));
		int youngest = Math.min(a,Math.min(b,c));
		System.out.println("Oldest age:" + oldest);
		System.out.println("Youngest age:" + youngest);
		sc.close();
		}
}
		
		