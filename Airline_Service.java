package Airline_Example_Service;

import java.util.HashMap;
import Airline_Example.*;

public class Airline_Service {
    HashMap<String, Passenger> passengers = new HashMap<>();
    HashMap<String, Booking> bookings = new HashMap<>();
    HashMap<String, Ticket> tickets = new HashMap<>();
    HashMap<String, FlightDetails> flights = new HashMap<>();

    
    public void createPassenger(String pass_id, String name, String email, String phone) {
        if (passengers.containsKey(pass_id)) {
            System.out.println("Passenger ID already exists!");
            return;
        }
        Passenger passenger = new Passenger(pass_id, name, email, phone);
        passengers.put(pass_id, passenger);
        System.out.println("Passenger created successfully!");
    }

 
    public void addFlight(String flightId, String airlineName, String source, String destination, String departureTime, int seats, double fare) {
        if (flights.containsKey(flightId)) {
            System.out.println("Flight ID already exists!");
            return;
        }
        FlightDetails flight = new FlightDetails(flightId, airlineName, source, destination, departureTime, seats, fare);
        flights.put(flightId, flight);
        System.out.println("Flight added successfully!");
    }

   
    public void viewAllFlights() {
        if (flights.isEmpty()) {
            System.out.println("No flights available.");
            return;
        }
        for (FlightDetails flight : flights.values()) {
            System.out.println(flight);
        }
    }
    
    public void searchFlights(String source, String destination) {
        boolean found = false;
        for (FlightDetails flight : flights.values()) {
            if (flight.getSource().equalsIgnoreCase(source) && flight.getDestination().equalsIgnoreCase(destination)) {
                System.out.println(flight);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No flights available from " + source + " to " + destination);
        }
    }


    public void createBooking(String bookingId, String pass_id, String flightId) {
        if (!passengers.containsKey(pass_id)) {
            System.out.println("Invalid Passenger ID.");
            return;
        }
        if (!flights.containsKey(flightId)) {
            System.out.println("Invalid Flight ID.");
            return;
        }

        FlightDetails flight = flights.get(flightId);

        if (flight.getAvailableSeats() <= 0) {
            System.out.println("Sorry, no seats available on this flight.");
            return;
        }

        Passenger passenger = passengers.get(pass_id);
        Booking booking = new Booking(bookingId, passenger, null, null);
        booking.setFlightDetails(flight);  // We'll add this setter in Booking
        bookings.put(bookingId, booking);

        // Reduce available seats by 1
        flight.setAvailableSeats(flight.getAvailableSeats() - 1);

        booking.confirm_booking(true);
    }

    
    public void issueTicket(String ticketId, String pass_id, String bookingId) {
        if (passengers.containsKey(pass_id) && bookings.containsKey(bookingId)) {
            Passenger p = passengers.get(pass_id);
            Ticket ticket = new Ticket(ticketId, p, bookings.get(bookingId), null);
            tickets.put(ticketId, ticket);
            ticket.confirm_ticket(true);
        } else {
            System.out.println("Invalid Passenger or Booking ID.");
        }
    }

    public void cancelTicket(String ticketId) {
        if (tickets.containsKey(ticketId)) {
            Ticket ticket = tickets.get(ticketId);
            Booking booking = ticket.getBooking();
            if (booking != null && booking.getFlightDetails() != null) {
                FlightDetails flight = booking.getFlightDetails();
                // Increase seat count back on cancellation
                flight.setAvailableSeats(flight.getAvailableSeats() + 1);
            }
            tickets.remove(ticketId);
            System.out.println("Ticket cancelled successfully.");
        } else {
            System.out.println("Ticket not found.");
        }
    }

    public void viewPassenger(String pass_id) {
        if (passengers.containsKey(pass_id)) {
            System.out.println(passengers.get(pass_id));
        } else {
            System.out.println("Passenger not found.");
        }
    }

    public void viewAllPassengers() {
        if (passengers.isEmpty()) {
            System.out.println("No passengers found.");
            return;
        }
        for (Passenger p : passengers.values()) {
            System.out.println(p);
        }
    }
}
