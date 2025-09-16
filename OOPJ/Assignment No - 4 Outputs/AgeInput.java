import java.util.Scanner;

class AgeInput{
public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		try{
			int age = Integer.parseInt(input.trim());
			System.out.println("Age = " + age);
			
		}catch(NumberFormatException e){
			System.out.println("Invalid number format");
		}finally{
			sc.close();
		}
}
}