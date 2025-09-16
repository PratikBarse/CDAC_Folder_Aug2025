import java.util.Scanner;
public class Program19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int m = sc.nextInt();
        String res;
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                res = "31 days"; break;
            case 4: case 6: case 9: case 11:
                res = "30 days"; break;
            case 2:
                res = "28 or 29 days"; break;
            default: res = "Invalid month number"; break;
        }
        System.out.println(res);
        sc.close();
    }
}
