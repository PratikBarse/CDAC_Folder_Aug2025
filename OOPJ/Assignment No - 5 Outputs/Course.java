import java.util.*;
class Course{
	public static void main(String args[]){
		Set<String> course = new HashSet<>();
		course.add("CS101");
		course.add("MA101");
		course.add("CS101");
		
		System.out.println("Registered Courses : " + course);
	}
}