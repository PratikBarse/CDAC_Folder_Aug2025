abstract class Employee{
		String name;
		double salary;
		
		Employee(String name, double salary){
			this.name = name;
			this.salary = salary;
		}
		
	abstract double calculateBonus();
	
}
class Manager extends Employee{

	Manager(String name, double salary){
		super(name,salary);
	}
	
	double calculateBonus(){
		return 0.20 * salary;
	}

}	
class Developer extends Employee{
	Developer(String name, double salary){
		super(name,salary);
	}
	
	double calculateBonus(){
		return 0.10 * salary;
		
	}
}

class EmployeeBonus{
	public static void main(String args[]){
		Manager m = new Manager("Pratik",5000);
		Developer d = new Developer("Ashish",6000);
			System.out.println("Pratik Bonus =" + m.calculateBonus());
			System.out.println("Ashish Bonus =" + d.calculateBonus());
	}
}
