class Student{
	int rollNo;
	String name;
	double marks;
	
	public Student(int rollNo, String name, double marks){
	
	this.rollNo = rollNo;
	this.name = name;
	this.marks = marks;
	
	}
	
	public double getMarks(){
		return this.marks;
	}
	
	public void setMarks(double marks){
		this.marks = marks;
	}
	
	
	public String toString(){
		return "Roll No : " + this.rollNo + ", Name: " + this.name + ",Marks : " + this.marks ;
	}

}


class StudentMarksChecker{
	public static void main(String args[]){
	
		Student s1 = new Student(101, "Pratik" , 85.5);
		System.out.println("Student Details");
		System.out.println(s1.toString());
		
		System.out.println("Marks Details");
		s1.setMarks(92.0);
		
		System.out.println("Student Details");
		System.out.println(s1.toString());
		
	}
}