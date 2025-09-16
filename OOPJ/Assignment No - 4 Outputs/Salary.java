import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Integer boxed = Integer.valueOf(sc.nextInt());
		int primitive = boxed.intValue();
		System.out.println("int value : " + primitive);
		}
	}