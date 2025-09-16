import java.util.*;

class StudentRegistration{
	public static void main(String args[]){
		Map<String, Integer> registraton = new LinkedHashMap<>();
		
		registraton.put("Amit",90);
		registraton.put("Rohan",102);
		registraton.put("Priya",103);
		
		System.out.println("Registration Order : " + registraton);
	}
}