import java.util.Scanner;

class MarksValidation{
	public static void main(String arg[]){
	
	Scanner sc = new Scanner(System.in);
	int marks = sc.nextInt();
	
	try{
		validateMarks(marks);
		System.out.println("Marks are valid: " + marks);
	}catch(IllegalArgumentException e){
	System.out.println("Invalid marks");
	}finally{
		sc.close();
	}
		
	}
	static void validateMarks(int m){
		if(m<0 || m>100) throw new IllegalArgumentException("Invalid Mrks");
	}
}