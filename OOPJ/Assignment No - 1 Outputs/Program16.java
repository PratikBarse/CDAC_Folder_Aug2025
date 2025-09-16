import java.util.Scanner;
class Program16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = sc.next();
        if (s.length() != 1 || !Character.isLetter(s.charAt(0))) {
            System.out.println("Error: invalid input.");
        } else {
            char c = Character.toLowerCase(s.charAt(0));
            if ("aeiou".indexOf(c) >= 0) System.out.println("Vowel");
            else System.out.println("Consonant");
        }
        sc.close();
    }
}
