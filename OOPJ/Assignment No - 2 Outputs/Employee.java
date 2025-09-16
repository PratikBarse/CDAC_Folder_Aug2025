class Employee {
    String name;
    double salary;
    int yearsOfService;

    private static int totalEmployees = 0;

    Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        totalEmployees++;
    }

    public double calculateBonus() {
        return (yearsOfService > 5) ? salary * 0.05 : 0.0;
    }

    
    public String getName() { return name; }
    public double getSalary() { return salary; }
    public int getYearsOfService() { return yearsOfService; }

    
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setYearsOfService(int yearsOfService) { this.yearsOfService = yearsOfService; }

    static void showTotalEmployee() {
        System.out.println("Total employees: " + totalEmployees);
    }
}

class EmployeeSalaryManager {
    public static void main(String args[]) {
        Employee e1 = new Employee("Ravi", 150000, 6);
        Employee e2 = new Employee("Anita", 120000, 3);
        Employee e3 = new Employee("Suresh", 100000, 5);

        System.out.println("Employee1 Ravi Bonus : " + e1.calculateBonus());
        System.out.println("Employee2 Anita Bonus : " + e2.calculateBonus());
        System.out.println("Employee3 Suresh Bonus : " + e3.calculateBonus());

        Employee.showTotalEmployee();
    }
}
