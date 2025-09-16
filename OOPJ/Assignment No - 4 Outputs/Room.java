import java.util.Scanner;

public class Room{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String original =sc.nextLine();
		String toinsert = sc.nextLine();
		int index = Integer.parseInt(sc.nextLine().trim);
		
		
        StringBuffer sb = new StringBuffer(original);
        if (index >= 0 && index <= sb.length()) sb.insert(index, toInsert + " ");
        else sb.insert(0, toInsert + " ");
        System.out.println(sb.toString());
        sc.close();
		}
		}