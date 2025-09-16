class Student {
    private String name;
    Student(String name) { this.name = name; }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student object for " + name + " is being garbage collected");
        super.finalize();
    }
}

public class StudentObject {
    public static void main(String[] args) throws InterruptedException {
        createAndDropStudent();
        // Suggest GC (no guarantee finalize will run immediately)
        System.gc();
        // Give JVM a moment to run finalizers (not guaranteed)
        Thread.sleep(1000);
        System.out.println("Main finished");
    }

    static void createAndDropStudent() {
        Student s = new Student("Amit");
        // Drop reference
        s = null;
    }
}