import java.util.Scanner;

public class AgeEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int primitiveAge = sc.nextInt();
		Integer boxedAge = primitiveAge;
		System.out.println("Integer Object" + boxedAge);
		
	}
}