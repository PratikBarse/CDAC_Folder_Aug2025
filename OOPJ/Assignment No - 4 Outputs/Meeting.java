import java.util.Scanner;

public class Meeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String base = sc.nextLine();
		String appendText = sc.nextLine();
		StringBuilder sb = new StringBuilder(base);
		sb.append(" ").append(appendText);
		 System.out.println(sb.toString());
	}
	
}