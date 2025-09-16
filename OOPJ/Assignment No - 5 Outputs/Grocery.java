import java.util.*;

class Grocery{
	public static void main(String args[]){
		List<String> list = new ArrayList<>();
		System.out.println("Adding items: \"Milk\", \"Eggs\", \"Bread\"");
		list.add("Milk");
		list.add("Eggs");
		list.add("Bread");
			
			
			String purchasedItem = "Milk";
			System.out.println("Removing purchased item: " + purchasedItem );
			list.remove(purchasedItem);
			
			System.out.println("Items to buy : " + list);
			
		
	}
}