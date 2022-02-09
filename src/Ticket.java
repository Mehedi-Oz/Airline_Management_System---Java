public class Ticket {
    public String flight_details;

    public Ticket() {

    }

    public Ticket(String flight_details) {
        this.flight_details = flight_details;
    }

    public String getFlight_details() {
        return flight_details;
    }

    public void setFlight_details(String flight_details) {
        this.flight_details = flight_details;
    }

    public void Display_Ticket(){
        System.out.println("Flight Details: "+this.flight_details);
    }
}
