//Q.1
import java.util.Scanner;
class Program1{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Score for Test1: ");
		int s1 = sc.nextInt();
		System.out.println("Enter Score for Test2: ");
		int s2 = sc.nextInt();
		if(s1 > s2)System.out.println("Test1 has higher Score");
		else if(s2 > s1)System.out.println("Test2 has higher Score");
		else System.out.println("Both test has Equal score");
		sc.close();
	}
}