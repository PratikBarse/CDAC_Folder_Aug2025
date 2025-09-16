class Member{
	String name;
	int id;
	Member(String name, int id){
		this.name = name;
		this.id = id;
	}
}
class Teacher extends Member{
	String subject;
	
	Teacher(String name, int id, String subject){
		super(name, id);
		this.subject = subject;
	}
	
	void displayinfo(){
		System.out.println(name + "-> ID =" + id + ", Subject=" + subject);
	}
}
class Student extends Member{
	int grade;
	Student(String name , int id, int grade){
		super(name, id);
		this.grade = grade;
	}
	void displayinfo(){
		System.out.println(name + "-> ID =" + id + ",Grade =" + grade);
	}
}
class Staff extends Member{
	
	String department;
	Staff(String name, int id, String department ){
		super(name,id);
		this.department = department;
		System.out.println(name + " -> ID = " + id + ", Department = " + department);
		
	}
	void displayinfo(){
		System.out.println(name + " -> ID = " + id + ", Department = " + department);
	}
}
class SchoolMember{
	public static void main(String args[]){
	Teacher t = new Teacher("Pratik",112,"English");
	Student s = new Student("Riyansh",200,10);
	Staff ss = new Staff("Ashish",301,"Maintenance");
		t.displayinfo();
		s.displayinfo();
		ss.displayinfo();
	}
}