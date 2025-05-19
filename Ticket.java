package Airline_Example;

public class Ticket extends Flight{

	public Ticket(String id, Passenger passenger, Booking booking, Ticket ticket) {
		super(id, passenger, booking, ticket);
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public void confirm_ticket(boolean ticket) {
		if(ticket==true) {
			System.out.println("Ticket confirmed !");
		}
		else {
			System.out.println("Ticket Cancelled !!");
		}
		
	}

	@Override
	public void confirm_booking(boolean confirm) {
		
		
	}

}
