import java.util.*;

class TicketBooking{
	public static void main(String args[]){
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Amit");
		queue.add("Priya");
		queue.add("Rohan");
		
		String serving = queue.poll();
		
		System.out.println("Serving : " + serving + " , Queue : " + queue);
	}
}