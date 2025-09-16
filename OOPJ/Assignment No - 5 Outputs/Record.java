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
class Record{
	public static void main(String args[]){
		List<Student> student = new ArrayList<>();
		student.add(new Student("Amit", "A"));
		student.add(new Student("Priya" , "B"));
		
		System.out.println("Student Records : " + student);
	}
}