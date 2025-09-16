import java.util.Scanner;

public class ja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double primitiveSalary = Double.parseDouble(sc.nextLine());
		Double boxedSalary = Double.valueOf(primitiveSalary);
		System.out.println("Double Object: " + boxedSalary);
	}
}