//Q.2
import java.util.Scanner;
class HighestSalary{
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary for Company 1: ");
		double s1 = sc.nextDouble();
		System.out.println("Enter Salary for Company 2: ");
		double s2 = sc.nextDouble();
		System.out.println("Enter Salary for Company 3: ");
		double s3 = sc.nextDouble();
		if(s1 >= s2 && s1 >= s3)System.out.println("Company 1 offers the highest salary.");
		else if(s2 > s1 && s2 >= s3)System.out.println("Company 2 offers the highest salary.");
		else System.out.println("Company 3 offers the highest salary.");
		sc.close();
	}
}