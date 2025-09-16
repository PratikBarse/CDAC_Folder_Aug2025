import java.util.Scanner;
public class Program30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select operation (1-Addition, 2-Subtraction, 3-Multiplication, 4-Division): ");
        int op = sc.nextInt();
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        switch (op) {
            case 1: System.out.println("Result: " + (a + b)); break;
            case 2: System.out.println("Result: " + (a - b)); break;
            case 3: System.out.println("Result: " + (a * b)); break;
            case 4: System.out.println(b != 0 ? "Result: " + (a / b) : "Division by zero"); break;
            default: System.out.println("Invalid operation"); break;
        }
        sc.close();
    }
}
