import java.util.*;

class TextEditor{
	public static void main(String args[]){
		Stack<String> action = new Stack<>();
		
		action.push("Type A");
		action.push("Type B");
		action.push("Delete");
		
		action.pop();
		
		System.out.println("Current action :" + action);
	}
}