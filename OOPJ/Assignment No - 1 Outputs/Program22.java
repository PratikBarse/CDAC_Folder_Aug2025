import java.util.Scanner;
public class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int m = sc.nextInt();
        String month = (m==1)?"January":(m==2)?"February":(m==3)?"March":(m==4)?"April":(m==5)?"May":(m==6)?"June":(m==7)?"July":(m==8)?"August":(m==9)?"September":(m==10)?"October":(m==11)?"November":(m==12)?"December":"Invalid";
		System.out.println("Month is " + month);
        sc.close();
    }
}
