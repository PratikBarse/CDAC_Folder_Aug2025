import java.util.*;

class LibraryBook{
	public static void main(String args[]){
		Map<String, Integer> inventory = new HashMap<>();
		
		inventory.put("Java",3);
		inventory.put("Python",5);
		
		inventory.put("Java" ,inventory.get("Java") - 1 );
		
		System.out.println("Current inventory : " + inventory);
	}
}