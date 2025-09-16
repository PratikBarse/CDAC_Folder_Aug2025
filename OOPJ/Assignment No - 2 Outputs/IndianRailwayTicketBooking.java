class Passenger{
	String name;
	int age;
	String seatType;
	static int totalPassengers = 0;
	
	Passenger(String name, int age){
		this(name, age, "General");
	
	}
	
	Passenger(String name, int age , String seatType){
		this.name= name;
		this.age = age;
		this.seatType = seatType;
		totalPassengers++;
	}
	@override
	public String tostring(){
	return "Name:" + name + ",Age:" + age + ", seat:" + seatType;
	}
	
	static int getTotalPassenger(){
	return totalPassengers;
	}
	
	
	
	
	
}
class IndianRailwayTicketBooking{
public static void main(String args[]){

	Passenger p1 = new Passenger("Ravi", 25);
	Passenger p2 = new Passenger("Anita", 30, "AC Sleeper");
    Passenger p3 = new Passenger("Suresh", 40);
	
	
	System.out.println("Passenger1 Name :" + p1 );
	System.out.println("Passenger2 Name :"+ p2);
	System.out.println("Passenger3 Name :" + p3);
	System.out.println("Total Passengers Booked: " + Passenger.getTotalPassenger());
	

}

}