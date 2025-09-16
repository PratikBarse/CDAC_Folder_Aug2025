import java.util.*;
class BrowserHistory{	
	public static void main(String args[]){
		Stack<String> History = new Stack<>();
		
		History.push("Google");
		History.push("Youtube");
		History.push("GFG");
	
	History.pop();
	
	System.out.println("Currenr History : " + History);
	
	}
}