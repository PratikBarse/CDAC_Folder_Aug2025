import java.util.*;

class j{
	public static void main(String args[]){
		int LIMIT = 5;
		LinkedList<String> searches = new LinkedList<>();
		String[] input = {"Java","Python","C++","DSA","OOP","Spring"};
		for(String s : input){
			if(searches.size() == LIMIT){
				searches.removeFirst();
				
			}
			searches.add(s);
		}
		
		System.out.println("Recent Searches: " + searches);
	}
}