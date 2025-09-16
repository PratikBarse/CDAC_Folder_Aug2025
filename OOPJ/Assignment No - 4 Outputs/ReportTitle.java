import java.util.Scanner;

class ReportTitle{
	public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			
			String original = sc.nextLine();
			String dept = sc.nextLine();
			
			StringBuilder sb = new StringBuilder(original);
			int pos = sb.indexOf("Report");
			if(pos != -1){
				sb.insert(pos, " " + dept);
				
			}
			else{
				sb.append(" ").append(dept);
				
			}
			System.out.println(sb.toString());
	}
	
}