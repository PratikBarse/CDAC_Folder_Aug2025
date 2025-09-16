import java.util.*;

class DailyTaskTracker{
	public static void main(String args[]){
		List<String> list = new ArrayList<>();
		
		list.add("Study Java");
		list.add("Complete Assignment");
		list.add("Exercise");
		
		
		list.remove("Exercise");
		
		System.out.println("Remaining tasks : " + list);
	}
}