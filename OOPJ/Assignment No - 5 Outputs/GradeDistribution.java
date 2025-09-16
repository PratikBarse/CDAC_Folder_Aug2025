import java.util.*;

class GradeDistribution{
	public static void main(String args[]){
		String [] inputgrade = {"A","B","A","C","B","A"};
		Map<String, Integer> Distribution = new HashMap<>();
		
		for(String g : inputgrade){
		Distribution.put(g, Distribution.getOrDefault(g,0)+1);
		
		}
		System.out.println("Grade Distribution : " + Distribution);
	}
}