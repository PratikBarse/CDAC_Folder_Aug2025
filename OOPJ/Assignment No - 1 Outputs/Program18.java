import java.util.Scanner;
public class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter day number :");
		int d = sc.nextInt();
		String day;
		switch (d) {
			
		
			case 1 : day = "Monday";break;
			case 2 : day = "Tuesday";break;
			case 3 : day = "Wednesday";break;
			case 4 : day = "Thursday";break;
			case 5 : day = "Friday";break;
			case 6 : day = "Saturday";break;
			case 7 : day = "Sunday";break;
			default: day = "Invalid day number";break;
			
			
			
		}
		System.out.println("Day is " + day);
        sc.close();
		}
		}