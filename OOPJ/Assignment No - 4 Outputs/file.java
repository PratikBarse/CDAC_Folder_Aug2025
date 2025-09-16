import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine().trim();  // e.g. student_list.txt

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file); // may throw FileNotFoundException
            System.out.println("File found. Contents:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            sc.close();
        }
    }
}
