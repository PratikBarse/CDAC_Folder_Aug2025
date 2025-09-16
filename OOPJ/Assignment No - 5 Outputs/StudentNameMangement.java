import java.util.*;
class StudentNameMangement{
	public static void main(String args[]){
		List<String> students = new ArrayList<>();
		
	
		students.add("Pratik");
		students.add("Ashish");
		students.add("Riyansh");
		
	
		students.remove("Pratik");
		
		 System.out.println("Students: " +students);
		
	}
}