class Grade{
	public static void main(String args[]){
	int math = 80;
	int science = 85;
	int History = 90;
	
	double average = (math + science + History) / 3;
	
	System.out.println("Average Marks" + average );
	
	if (average >= 90) {
		System.out.println("Grade A");
	}
	else if(average>=70 && average>=89) {
		System.out.println("Grade B");
	
	}
	else if (average>=50 && average>=69){
		System.out.println("Grade C");
	
		
	}
	else if (average>=30 && average>=49){
		System.out.println("Grade D");
	}
	else if (average < 30){
		System.out.println("Fail");
	}
}
}