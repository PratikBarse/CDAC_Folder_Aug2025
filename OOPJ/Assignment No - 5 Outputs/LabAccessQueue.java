import java.util.*;

class LabAccessQueue{
	public static void main(String args[]){
	
	Queue<String> queue = new LinkedList<>();
	
	queue.add("Amit");
	queue.add("Priya");
	queue.add("Rohan");
	
	queue.poll();
	
	System.out.println("Queue : " + queue);
}

}