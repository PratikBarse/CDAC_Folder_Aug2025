import java.util.Scanner;
public class Program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int m = sc.nextInt();
		if (m==12 || m==1 || m==2) System.out.println("Season is Winter");
        else if (m>=3 && m<=5) System.out.println("Season is Summer");
        else if (m>=6 && m<=8) System.out.println("Season is Monsoon");
        else if (m>=9 && m<=11) System.out.println("Season is Autumn");
        else System.out.println("Invalid month number");
        sc.close();
    }
}