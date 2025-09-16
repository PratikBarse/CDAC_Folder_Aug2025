import java.util.*;

class Department{
	public static void main(String args[]){
		Map<String, List<String>> dept = new HashMap<>();
		
		dept.put("IT", Arrays.asList("Amit", "Rohan"));
		dept.put("HR", Arrays.asList("Priya"));
		
		System.out.println("Department Structure :" + dept);
	}
}