import java.util.*;

class EvenRollNumber{
	public static void main(String args[]){
		List<Integer> rolls = new ArrayList<>(Arrays.asList(101,102,103,104));
		
		rolls.removeIf(n -> n % 2 != 0 );
		System.out.println("Even Roll Numbers :" + rolls);
	}
}



/* import java.util.*;

class EvenRollNumber {
    public static void main(String args[]) {
        // List of roll numbers
        List<Integer> rolls = new ArrayList<>(Arrays.asList(101, 102, 103, 104));

        // Remove odd numbers
        rolls.removeIf(n -> n % 2 != 0);

        System.out.println("Even Roll Numbers: " + rolls);
    }
}
 */