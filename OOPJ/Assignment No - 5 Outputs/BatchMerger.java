import java.util.*;

class BatchMerger{
public static void main(String args[]){
	List<String> morning =  Arrays.asList("Amit", "Priya");
	List<String> evening =  Arrays.asList("Rohan", "Priya");
	
	Set<String> combined = new LinkedHashSet<>();
	combined.addAll(morning);
	combined.addAll(evening);
	
	
	System.out.println("Combined batches: " + combined);
}
}