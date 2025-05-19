package Airline_Example;

public class FlightDetails {
    private String flightId;
    private String airlineName;
    private String source;
    private String destination;
    private String departureTime;
    private int availableSeats;
    private double fare;

    public FlightDetails(String flightId, String airlineName, String source, String destination, String departureTime, int availableSeats, double fare) {
        this.flightId = flightId;
        this.airlineName = airlineName;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.availableSeats = availableSeats;
        this.fare = fare;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public double getFare() {
        return fare;
    }

    @Override
    public String toString() {
        return "FlightDetails [flightId=" + flightId + ", airlineName=" + airlineName + ", source=" + source
                + ", destination=" + destination + ", departureTime=" + departureTime + ", availableSeats="
                + availableSeats + ", fare=" + fare + "]";
    }
}
