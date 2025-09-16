import java.util.*;

class EventAttendance{
	public static void main(String args[]){
		Set<String> attendees = new HashSet<>();
		attendees.add("Amit");
		attendees.add("Rohan");
		attendees.add("Amit");
		attendees.add("Priya");
		
		System.out.println("Total unique attendees : " + attendees.size());
		
	}
}