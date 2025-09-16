class Student{
	String name;
	int marks;
	
	
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
		
	}
	
	
	String calculateGrade(){
		if(marks >= 80) return "A";
		if(marks >= 60) return "B";
		if(marks >= 40) return "C";
		return "Fail";
	
	}
	
	
	public String toString(){
		return "Name = " + name + "Marks = " + marks + " Grade " + calculateGrade();
	}
	
	
}


class StudentGradeCalculator{

	public static void main(String args[]){
		Student s1 = new Student("Pratik", 85);
		Student s2 = new Student("Riyansh", 59);
		
		System.out.println(s1);
		System.out.println(s2);
	
	}
}


