package Airline_Example;

public class Booking extends Flight {
    private FlightDetails flightDetails;  // New field to hold flight info

    public Booking(String id, Passenger passenger, Booking booking, Ticket ticket) {
        super(id, passenger, booking, ticket);
    }

    // Getter and Setter for FlightDetails
    public FlightDetails getFlightDetails() {
        return flightDetails;
    }

    public void setFlightDetails(FlightDetails flightDetails) {
        this.flightDetails = flightDetails;
    }

    @Override
    public void confirm_ticket(boolean ticket) {
        // Not used here, so can leave empty
    }

    @Override
    public void confirm_booking(boolean confirm) {
        if (confirm) {
            System.out.println("Your booking is successful!");
            System.out.println("Flight Details: " + flightDetails);
            System.out.println("Have A Nice Journey!");
        } else {
            System.out.println("Booking Failed!");
        }
    }

    @Override
    public String toString() {
        return "Booking [id=" + getId() + ", passenger=" + getPassenger() +
               ", flightDetails=" + flightDetails + "]";
    }
}
