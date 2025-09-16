class Ticket {
	static int counter =5001;
	int ticketNo;
	String passengerName;
	
	
	Ticket(String passengerName)
	{
		this.ticketNo = counter++;
			this.passengerName = passengerName;
	}





public void displayTicket() {
            System.out.println("Ticket No: " + ticketNo + ", Passenger: " + passengerName);
        }

}

class TicketBookingSystem{
	public static void main(String args []){
	TicketBookingSystemket t1 = new Ticket("Rahul"); 
	Ticket t2 = new Ticket("Pratik");
	Ticket t3 = new Ticket("Ashish");
	
	
	t1.displayTicket();
	t2.displayTicket();
	t3.displayTicket();

	
	}
}