import java.util.Scanner;

class GreetingMessage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String initial = sc.nextLine();   
        String insert = sc.nextLine();    
        int index = Integer.parseInt(sc.nextLine().trim());
        String toAppend = sc.nextLine();
        
        StringBuilder sb = new StringBuilder(initial);
        
        if (index >= 0 && index <= sb.length()) { 
            sb.insert(index, " " + insert);  
        } else {
            sb.append(" ").append(insert);  
        }
        
        sb.append(" ").append(toAppend);
        System.out.println(sb.toString().trim());
        
        sc.close();
    }
}
