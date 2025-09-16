import java.util.Scanner;
public class EmployeeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format:
        // number of employees
        // salaries
        // working hours
        // index to access
        int n = sc.nextInt();
        int[] salaries = new int[n];
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        int hours = sc.nextInt();
        int index = sc.nextInt();

        try {
            try {
                int salary = salaries[index];  // might throw ArrayIndexOutOfBoundsException
                int wage = salary / hours;     // might throw ArithmeticException
                System.out.println("Hourly wage = " + wage);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } finally {
            sc.close();
        }
    }
}
