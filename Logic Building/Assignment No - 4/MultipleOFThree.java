import java.util.Scanner;
	class MultipleOFThree{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter a Number:");
					 int N = sc.nextInt();
				for(int i = 1; i <= N; i++){
					if(i % 3 == 0){
						System.out.print(i +  " ");
					}
				}
				sc.close();	
		}
	}