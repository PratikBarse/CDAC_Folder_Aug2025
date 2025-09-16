import java.util.*;

class Employee{
	String name;
	double salary;
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
		
	}
	
	@Override
	public String toString(){	
		return name + ": " + salary;
	}
}

class EmployeeManagemnet{
	public static void main(String args[]){
		List<Employee> employee = new ArrayList<>();
		
		employee.add(new Employee("Amit", 50000));
		employee.add(new Employee("Priya", 60000));
		
		System.out.println("Employee List : " + employee);
	}
}