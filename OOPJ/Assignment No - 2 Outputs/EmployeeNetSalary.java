class Employee {

	    static int counter = 1001;
         int id;
         String name;
         double basicSalary;


			 Employee(String name, double basicSalary) {
            this.id = counter++;
            this.name = name;
            this.basicSalary = basicSalary;
        }
		
		
		
		 public double calculateNetSalary() {
            double hra = basicSalary * 0.10;
            double da = basicSalary * 0.05;
            double pf = basicSalary * 0.02;
            return basicSalary + hra + da - pf;
        }
		
		
		 public String toString() {
            return "ID=" + id + ", Name=" + name + ", NetSalary=" + calculateNetSalary();
        }
    }


class EmployeeNetSalary {


public static void main(String[] args) {
        Employee e1 = new Employee("Ravi", 30000);
        Employee e2 = new Employee("Pratik", 40000);

        System.out.println(e1);
        System.out.println(e2);
		
		
		}
		
		
		}