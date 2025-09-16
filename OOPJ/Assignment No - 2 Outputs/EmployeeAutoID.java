class Employee {
	static int counter = 1001;
	int id;
	String name;
	double basicSalary;
	
	Employee(){
		this("Unknown", 20000);
	
	}
	
	Employee(String name , double basicSalary){
		 this.id = counter++;
            this.name = name;
            this.basicSalary = basicSalary;
	}
	
	
	
	
        public int getId() { return id; }
        public String getName() { return name; }
        public double getBasicSalary() { return basicSalary; }
}

class EmployeeAutoID {
 public static void main(String[] args) {
 
 
	Employee e1 = new Employee()
	Employee e2 = new Employee("Pratik", 35000);
	
	
	      System.out.println("ID=" + e1.getId() + ", Name=" + e1.getName() + ", Salary=" + e1.getBasicSalary());
        System.out.println("ID=" + e2.getId() + ", Name=" + e2.getName() + ", Salary=" + e2.getBasicSalary());
 
 
 }
}