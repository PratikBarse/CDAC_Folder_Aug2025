import java.util.Scanner;

public class Outdated {
    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();  // e.g. "Java is outdated"
        String toDelete = sc.nextLine();  // e.g. "outdated"
		
        StringBuffer sb = new StringBuffer(original);
        int idx = sb.indexOf(toDelete);
		
        if (idx != -1) {
            sb.delete(idx, idx + toDelete.length());
            System.out.println(sb.toString().trim());
        } else {
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
j