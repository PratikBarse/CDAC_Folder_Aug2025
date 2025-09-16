import java.util.Scanner;
public class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic light color: ");
        String col = sc.next().toLowerCase();
        switch (col) {
            case "red": System.out.println("Stop"); break;
            case "yellow": System.out.println("Slow down / Prepare to stop"); break;
            case "green": System.out.println("Go"); break;
            default: System.out.println("Invalid color"); break;
        }
        sc.close();
    }
}
