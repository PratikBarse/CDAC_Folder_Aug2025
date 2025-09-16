abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}

class PermanentEmployee extends Employee {
    double basicSalary, hra;

    PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    double calculateSalary() {
        return basicSalary + hra;
    }

    double calculateBonus() {
        return 0.10 * (basicSalary + hra);
    }
}

class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeManagementDemo {
    public static void main(String[] args) {
        PermanentEmployee pe = new PermanentEmployee("Amit", 1, 50000, 5000);
        ContractEmployee ce = new ContractEmployee("Neha", 2, 300, 100);

        System.out.println(pe.name + " Salary = " + pe.calculateSalary() + ", Bonus = " + pe.calculateBonus());
        System.out.println(ce.name + " Salary = " + ce.calculateSalary());
    }
}
