import java.util.Scanner;

public class Ticket{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String ticket = sc.nextLine();
	StringBuffer sb = new StringBuffer(ticket);
	System.out.println(sb.reverse().toString());
}
}