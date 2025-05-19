package Airline_Example;

public abstract class Flight {
	private String id;
	private Passenger passenger;
	protected Booking booking;
	protected Ticket ticket;
	
	
	public Flight(String id, Passenger passenger, Booking booking, Ticket ticket) {
		super();
		this.id = id;
		this.passenger = passenger;
		this.booking = booking;
		this.ticket = ticket;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	

	@Override
	public String toString() {
		return "Flight [id=" + id + ", passenger=" + passenger + ", booking=" + booking + ", ticket=" + ticket + "]";
	}

	public abstract void confirm_ticket(boolean ticket);
	
	public abstract void confirm_booking(boolean confirm);

}
