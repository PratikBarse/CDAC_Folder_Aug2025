import java.util.*;

class Notification{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Original text:" );
		String original = sc.nextLine();
		System.out.println("Text to find:" );
		String find = sc.nextLine();
		System.out.println("Replacement text:" );
		String replacement = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(original);
		
		int idx = sb.indexOf(find);
		if(idx != -1){
			sb.replace(idx, idx + find.length(), replacement);
			
			
		}
		System.out.println(sb.toString());
		sc.close();
		
	}
}