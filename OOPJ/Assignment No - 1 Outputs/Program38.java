import java.util.Scanner;
public class Program38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().toLowerCase().charAt(0);
        String res = "aeiou".indexOf(ch) >= 0 ? "Vowel" : "Consonant";
        System.out.println(res);
        sc.close();
    }
}
