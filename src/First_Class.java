public class First_Class{
    public String flight_details;
    public int flight_id;
    public double price;

    public First_Class() {

    }

    public First_Class(String flight_details, int flight_id, double price) {
        this.flight_details = flight_details;
        this.flight_id = flight_id;
        this.price = price;
    }

    public String getFlight_details() {
        return flight_details;
    }

    public void setFlight_details(String flight_details) {
        this.flight_details = flight_details;
    }

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void First_Class_Display() {
        System.out.println(this.flight_details + "       " + this.flight_id + "           " + this.price);
    }
}
