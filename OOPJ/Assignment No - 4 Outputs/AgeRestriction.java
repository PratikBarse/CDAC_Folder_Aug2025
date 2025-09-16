import java.util.*;

class AgeNotValidException extends Exception{
	AgeNotValidException(String msg){
		super(msg);
	}
}
class AgeRestriction{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try{
			validateAge(age);
			
			System.out.println("Registration Successful");
		}
		
		catch(AgeNotValidException e){
			System.out.println("AgeNotValidException: " + e.getMessage());
			
		}
		finally{
		}
	}
	static void validateAge(int age) throws AgeNotValidException{
		if(age < 18)throw new AgeNotValidException("Age must be >= 18");
	}
}