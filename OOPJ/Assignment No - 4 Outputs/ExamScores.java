import java.util.Scanner;
 class ExamScores{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] scores = new int[n];
		for (int i=0; i<n; i++) scores[i] = sc.nextInt();
		int idx = sc.nextInt();
		
		
		try{
			System.out.println("Scores at index : " + idx + " = " + scores[idx]);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index accessed");
		}finally{
		}sc.close();
	}
 }