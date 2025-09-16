import java.util.*;

class GradeBasedStudent{
	public static void main(String args[]){
		Map<String, Integer> grades = new HashMap<>();
		grades.put("Amit",85);
		grades.put("Priya",52);
		grades.put("Rohan",78);
		
		grades.entrySet().removeIf(entry -> entry.getValue() < 60);
		
		System.out.println("Honor Roll : " + grades);
	}
}
