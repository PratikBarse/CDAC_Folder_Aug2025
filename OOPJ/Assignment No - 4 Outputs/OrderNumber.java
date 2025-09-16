import java.util.Scanner;

class OrderNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inv = sc.nextLine();
		StringBuilder sb = new StringBuilder(inv);
		System.out.println(sb.reverse().toString());
		sc.close();
		
	}
}