import java.util.*;

class Student{
	String name;
	String grade;
	
	Student(String name, String grade){
		this.name = name;
		this.grade = grade;
		
	}
	
	
	@Override
	public String toString(){
		return name + ":" + grade;
	}
}

class GradeBasedStudent11{

	public static void main(String args[]){
		List<Student> student = new ArrayList<>();
		
		student.add(new Student("Amit","A"));
		student.add(new Student("Priya","C"));
		student.add(new Student("Rohan","B"));
		
		student.removeIf(s -> s.grade.compareTo("B") > 0);
		
		        System.out.println("Qualified Students: " + student);
	}
}