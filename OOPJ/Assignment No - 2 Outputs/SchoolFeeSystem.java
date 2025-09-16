class Student {
    String name;
    String className;
    static int tuitionFee;
    static {
        tuitionFee = 30000;
        System.out.println("School Tuition Fee Initialized: " + tuitionFee);
    }

    
    public void printDetails() {
        System.out.println("Name: " + this.name + ", Class: " + this.className + ", Tuition Fee: " + Student.tuitionFee);
    }

    
    void setName(String name) { this.name = name; }
    String getName() { return name; }

    void setClassName(String className) { this.className = className; }
    String getClassName() { return className; }
}

class SchoolFeeSystem {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.setName("Anjali");
        s1.setClassName("10th");

        Student s2 = new Student();
        s2.setName("Vikram");
        s2.setClassName("12th");

        System.out.println("Student1:");
        s1.printDetails();

        System.out.println("Student2:");
        s2.printDetails();
    }
}