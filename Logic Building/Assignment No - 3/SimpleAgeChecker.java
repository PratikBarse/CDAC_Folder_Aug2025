import java.util.Scanner;

public class SimpleAgeChecker {

    // Method to check age category
    public static void checkAgeCategory(int age) {
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age <= 59) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking for age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Calling method to check category
        checkAgeCategory(age);

        sc.close();
    }
}
