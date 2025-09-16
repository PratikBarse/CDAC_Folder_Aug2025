
 
 
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

class EmployeeManagemnet111{
	public static void main(String args[]){
		List<Employee> employee = new ArrayList<>();
		
		employee.add(new Employee("Amit", 50000));
		employee.add(new Employee("Priya", 60000));
		 employee.sort(Comparator.comparingDouble(e -> e.salary));
		System.out.println("Employee List : " + employee);
	}
}