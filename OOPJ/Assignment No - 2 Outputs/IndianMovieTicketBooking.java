class Customer{
	String name;
	String ticketType;
	static int totalTickets = 0;
	
	Customer(String name){
	this(name, "Normal");
	
	}
	Customer(String name, String ticketType)
	{
	this.name = name;
	this.ticketType = ticketType;
	totalTickets++;
	}
	
	@Override
	public String toString(){
		return "Name:" + name + ", Ticket: " + ticketType;
	}
	public static int getTotalTickets(){
		return totalTickets;
	}
	

}


class IndianMovieTicketBooking{
public static void main(String args[]){

	Customer c1 = new Customer("Rahul");
	Customer c2 = new Customer("Pooja", "Premium");
	Customer c3 = new Customer("Amit");
	
	System.out.println("Customer1 Name:" + c1);
	System.out.println("Customer2 Name:" + c2);
	System.out.println("Customer3 Name:" + c3);
	System.out.println("Total Passenger Booked : " + Customer.getTotalTickets());


}
}