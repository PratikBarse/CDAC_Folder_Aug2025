import java.util.Scanner;
 class SalarySplit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bonus amount : ");
		int bonus = sc.nextInt();
		
		System.out.println("Enter number of Employee : ");
		int employee = sc.nextInt();
		
		try{
			if(employee == 0){
				throw new ArithmeticException("Divison by Zero");
				
			}
			int share = bonus/employee;
			System.out.println("Each employee gets : " + share);
			
		}catch(ArithmeticException e){
			System.out.println("Error : Division by zero not allowed");
		}finally{
		}sc.close();
	}
 }