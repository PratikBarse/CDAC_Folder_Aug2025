class Staff{
	String name;
	double salary;
	Staff(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
}
class TeachingStaff extends Staff{
	String subject;
	TeachingStaff(String name,double salary,String subject){
	super(name,salary);
	this.subject = subject;
	}
	void Display(){
		System.out.println(name + " -> " + subject + "," + salary);
	}
}
class NonTeachingStaff extends Staff{
	String department;
	NonTeachingStaff(String name,double salary,String department){
	
	super(name,salary);
	this.department = department;
	}
	void Display(){
		System.out.println(name + " -> " + department + " , " + salary);
	}
}
class AcademicStaff{
	public static void main(String args[]){
		TeachingStaff t = new TeachingStaff("Pratik",50000,"math");
		NonTeachingStaff n = new NonTeachingStaff("Riyansh",40000,"admin");
		t.Display();
		n.Display();
	}
}

