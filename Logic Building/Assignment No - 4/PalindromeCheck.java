import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("The string '" + str + "' is a palindrome.");
        } else {
            System.out.println("The string '" + str + "' is not a palindrome.");
        }

        sc.close();
    }
}
