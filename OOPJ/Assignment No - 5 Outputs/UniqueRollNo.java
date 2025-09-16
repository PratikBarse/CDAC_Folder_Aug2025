import java.util.*;

class UniqueRollNo{
	public static void main(String args[]){
		Set<Integer> rollNumbers = new HashSet<>();
		System.out.println("Roll numbers: 101,102,101,103");
		rollNumbers.add(101);
		rollNumbers.add(102);
		rollNumbers.add(101);
		rollNumbers.add(103);
		System.out.println("Unique Roll Number: " + rollNumbers);
	}
}