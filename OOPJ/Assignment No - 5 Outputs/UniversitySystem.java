
import java.util.*;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    String department;
    double cgpa;

    Student(int rollNo, String name, String department, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }

    // For Merit List (sort by CGPA descending)
    @Override
    public int compareTo(Student s) {
        return Double.compare(s.cgpa, this.cgpa); 
    }

    @Override
    public String toString() {
        return name + "(" + cgpa + ")";
    }
}



public class UniversitySystem {
    public static void main(String[] args) {
        // Sample Data
        Student s1 = new Student(101, "Amit", "CS", 8.5);
        Student s2 = new Student(102, "Priya", "Math", 9.2);
        Student s3 = new Student(103, "Rohan", "CS", 7.8);
        Student s4 = new Student(104, "Sneha", "Physics", 4.5);

        // 1. Registration List (ArrayList)
        List<Student> registrationList = new ArrayList<>(Arrays.asList(s1, s2, s3, s4));
        System.out.println("Registration Order: " + registrationList);

        // 2. Merit List (Comparable - sort by CGPA desc)
        List<Student> meritList = new ArrayList<>(registrationList);
        Collections.sort(meritList);
        System.out.println("Merit List: " + meritList);

        // 3. Alphabetical List (Comparator - sort by name)
        List<Student> alphaList = new ArrayList<>(registrationList);
        alphaList.sort(Comparator.comparing(s -> s.name));
        System.out.println("Alphabetical: " + alphaList);

        // 4. Department Grouping (HashMap<String, List<Student>>)
        Map<String, List<Student>> deptMap = new HashMap<>();
        for (Student s : registrationList) {
            deptMap.computeIfAbsent(s.department, k -> new ArrayList<>()).add(s);
        }
        System.out.println("Department Groups: " + deptMap);

        // 5. Unique Names (HashSet<String>)
        Set<String> uniqueNames = new HashSet<>();
        for (Student s : registrationList) uniqueNames.add(s.name);
        System.out.println("Unique Names: " + uniqueNames);

        // 6. Roll Number Sorting (TreeSet<Student>)
        Set<Student> rollSorted = new TreeSet<>(Comparator.comparingInt(s -> s.rollNo));
        rollSorted.addAll(registrationList);
        System.out.println("Roll Number Sorted: " + rollSorted);

        // 7. Performance Filter (Iterator - remove CGPA < 5.0)
        List<Student> filtered = new ArrayList<>(registrationList);
        Iterator<Student> it = filtered.iterator();
        while (it.hasNext()) {
            if (it.next().cgpa < 5.0) it.remove();
        }
        System.out.println("After Filter (CGPA >= 5.0): " + filtered);

        // 8. Recent Registrations (Stack<Student>)
        Stack<Student> stack = new Stack<>();
        stack.addAll(registrationList);
        System.out.println("Recent Registrations (Stack): " + stack);

        // 9. Scholarship Queue (FIFO)
        Queue<Student> queue = new LinkedList<>(registrationList);
        System.out.println("Scholarship Queue: " + queue);

        // 10. Hostel Applications (LinkedList<Integer>)
        LinkedList<Integer> hostel = new LinkedList<>();
        hostel.addLast(105); // regular applicant
        hostel.addFirst(101); // priority applicant
        System.out.println("Hostel Queue: " + hostel);
        hostel.removeFirst(); // allocate one
        System.out.println("After allocation: " + hostel);
    }
}
