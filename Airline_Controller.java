package Airline_Example_Controller;

import java.util.Scanner;
import Airline_Example_Service.Airline_Service;

public class Airline_Controller {
    public static void main(String[] args) {
        Airline_Service service = new Airline_Service();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========== Airline Reservation System ==========");
            System.out.println("1 -> Create Passenger");
            System.out.println("2 -> Add Flight");             
            System.out.println("3 -> Create Booking");
            System.out.println("4 -> Issue Ticket");
            System.out.println("5 -> Cancel Ticket");
            System.out.println("6 -> View Passenger");
            System.out.println("7 -> View All Passengers");
            System.out.println("8 -> View All Flights");       
            System.out.println("0 -> Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Thank you for using Airline Services.");
                    System.exit(0);

                case 1:
                    System.out.print("Enter Passenger ID: ");
                    String passId = sc.next();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Email: ");
                    String email = sc.next();
                    System.out.print("Enter Phone: ");
                    String phone = sc.next();
                    service.createPassenger(passId, name, email, phone);
                    break;

                case 2:  
                    System.out.print("Enter Flight ID: ");
                    String flightId = sc.next();
                    System.out.print("Enter Airline Name: ");
                    String airlineName = sc.next();
                    System.out.print("Enter Source: ");
                    String source = sc.next();
                    System.out.print("Enter Destination: ");
                    String destination = sc.next();
                    System.out.print("Enter Departure Time: ");
                    String departureTime = sc.next();
                    System.out.print("Enter Total Seats: ");
                    int seats = sc.nextInt();
                    System.out.print("Enter Fare: ");
                    double fare = sc.nextDouble();
                    service.addFlight(flightId, airlineName, source, destination, departureTime, seats, fare);
                    break;

                case 3:
                    System.out.print("Enter Booking ID: ");
                    String bookingId = sc.next();
                    System.out.print("Enter Passenger ID: ");
                    String bookPassId = sc.next();

                    System.out.print("Enter Source: ");
                    String source1 = sc.next();
                    System.out.print("Enter Destination: ");
                    String destination1 = sc.next();

                    System.out.println("Available flights for your route:");
                    service.searchFlights(source1, destination1);  

                    System.out.print("Enter Flight ID to book: ");
                    String bookFlightId = sc.next();

                    service.createBooking(bookingId, bookPassId, bookFlightId);
                    break;


                case 4:
                    System.out.print("Enter Ticket ID: ");
                    String ticketId = sc.next();
                    System.out.print("Enter Passenger ID: ");
                    String ticketPassId = sc.next();
                    System.out.print("Enter Booking ID: ");
                    String bookId = sc.next();
                    service.issueTicket(ticketId, ticketPassId, bookId);
                    break;

                case 5:
                    System.out.print("Enter Ticket ID to Cancel: ");
                    String cancelId = sc.next();
                    service.cancelTicket(cancelId);
                    break;

                case 6:
                    System.out.print("Enter Passenger ID: ");
                    String viewId = sc.next();
                    service.viewPassenger(viewId);
                    break;

                case 7:
                    service.viewAllPassengers();
                    break;

                case 8: 
                    service.viewAllFlights();
                    break;

                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }
}
