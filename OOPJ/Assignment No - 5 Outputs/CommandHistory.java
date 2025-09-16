import java.util.*;

class CommandHistory{
	public static void main(String args[]){
		int LIMIT = 3;
		LinkedList<String> command = new LinkedList<>();
		
		String [] input = {"ls", "pwd", "cd..", "mkdir"};
		
		for(String a : input){
			if(command.size() == LIMIT){
				command.removeFirst();
			}
			command.add(a);
		}
		System.out.println("Recent Commands : " + command);
	}
}