import java.util.Scanner;
class Program17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) System.out.println("Divisible by 2");
        if (n % 3 == 0) System.out.println("Divisible by 3");
        if (n % 5 == 0) System.out.println("Divisible by 5");
        sc.close();
    }
}
