class Employee{
	String name;
	double basicSalary;
	Employee(String name, double basicSalary){
		this.name = name;
		this.basicSalary = basicSalary;
	}
}

class RegularEmployee extends Employee{
	RegularEmployee(String name, double basicSalary){
		super(name,basicSalary);
	}
	
	double getNetSalary(){
		return basicSalary + (0.10 * basicSalary );
	}
	
}
class ContractEmployee extends Employee{
	ContractEmployee(String name, double basicSalary){
		super(name,basicSalary);
		
	}
	
	double getNetSalary(){
		return basicSalary + (0.05 * basicSalary);
	}
}

class EmployeeDemo{
	public static void main(String args[]){
		RegularEmployee r = new RegularEmployee("Pratik",22000);
		ContractEmployee c = new ContractEmployee("Riyansh",15750);
		System.out.println(r.name + " Net Salary = " + r.basicSalary);
		System.out.println(c.name + " Net Salary = " + c.basicSalary);
		
	}
}