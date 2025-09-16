class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println(name + " Salary = " + salary);
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        double total = salary + (0.20 * salary);
        System.out.println(name + " Total Salary = " + total);
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void displaySalary() {
        double total = salary + (0.20 * salary);
        System.out.println(name + " Total Salary = " + total);
    }
}

class EmployeeSalary {
    public static void main(String args[]) {
        Manager m = new Manager("Pratik", 50000);
        Developer d = new Developer("Ashu", 50000);

        m.displaySalary();
        d.displaySalary();
    }
}
