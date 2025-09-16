import java.util.*;
class JobQueue{	
	public static void main(String args[]){
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Doc1");
		queue.add("Doc2");
		queue.add("Doc3");
		
		String printing = queue.poll();
	
	System.out.println("Printing :" + printing + ", Queue : " + queue);
	}
	
}