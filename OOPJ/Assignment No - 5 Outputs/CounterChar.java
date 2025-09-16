/* import java.util.*;
class CounterChar{
	public static void main(String args[]){
		int countA=0;
		int countB=0;
		int countC=0;
		List<Character> l=new LinkedList<>();
		l.add('A');
		l.add('B');
		l.add('A');
		l.add('C');
		l.add('A');
		l.add('B');
		
		for (char ch : l) {
            if (ch == 'A') {
                countA++;
            } else if (ch == 'B') {
                countB++;
            } else if (ch == 'C') {
                countC++;
            }
        }
			
		System.out.println("list"+l+" countA: "+countA+" countB: "+countB+" countC: "+countC);
		
	}
} */ 









import java.util.*;

class CounterChar{
	public static void main(String args[]){
		int countA =0;
		int countB =0;
		int countC =0;
		List<Character> l = new LinkedList<>();
		l.add('A');
		l.add('B');
		l.add('A');
		l.add('C');
		l.add('A');
		l.add('B');
		
		for(char ch : l){
		if(ch == 'A'){
			countA++;
		}
		else if (ch == 'B'){
			countB++;
		} else if (ch == 'C'){
			countC++;
		}
		
		
		}
		System.out.println("List :" + l + "Count A" + countA + "Count B" + countB + "Count C" + countC);
		
		
	}

} 