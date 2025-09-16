import java.util.Scanner;
public class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m = sc.nextInt();
        int key = (m >= 0 && m <= 100) ? (m/10) : -1;
        switch (key) {
            case 10: case 9: System.out.println("Grade: A"); break;
            case 8: case 7: System.out.println("Grade: B"); break;
            case 6: System.out.println("Grade: C"); break;
            case 5: System.out.println("Grade: C"); break;
            case 4: case 3: System.out.println("Grade: E"); break;
            case 2: case 1: case 0: System.out.println("Grade: F"); break;
            default: System.out.println("Invalid marks"); break;
        }
        sc.close();
    }
}




/* C:\Users\91779\OneDrive\Desktop\CDAC Folder\OOPJ\Assignment No - 1 Output>javac Program24.java

C:\Users\91779\OneDrive\Desktop\CDAC Folder\OOPJ\Assignment No - 1 Output>java Program24
Enter marks: 78
Grade: B */