import java.util.Scanner;
public class Program21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int d = sc.nextInt();
        String day = (d==1)?"Sunday":(d==2)?"Monday":(d==3)?"Tuesday":(d==4)?"Wednesday":(d==5)?"Thursday":(d==6)?"Friday":(d==7)?"Saturday":"Invalid";
        System.out.println("Day is " + day);
        sc.close();
    }
}
