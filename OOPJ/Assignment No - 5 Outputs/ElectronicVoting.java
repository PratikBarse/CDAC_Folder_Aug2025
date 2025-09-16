import java.util.*;

class ElectronicVoting{
	public static void main(String args[]){
		Set<Integer> voters = new HashSet<>();
		voters.add(201);
		voters.add(202);
		voters.add(203);
		voters.add(202);
		
		System.out.println("Total Voters : " + voters.size());
	}
}