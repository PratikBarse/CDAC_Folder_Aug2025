import java.util.Scanner;

public class Message {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		String find = sc.nextLine();
		String replacement = sc.nextLine();
		StringBuffer sb = new StringBuffer(original);
		
			int idx = sb.indexOf(find);
			if(idx != -1){
				sb.replace(idx, idx + find.length(), replacement);
				
			}
			System.out.println(sb.toString());
	}
}