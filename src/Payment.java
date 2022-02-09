public class Payment {
    public double amount;
    public String details;

    public Payment() {

    }

    public Payment(double amount, String details) {
        this.amount = amount;
        this.details = details;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void Payment_Display(){
        System.out.println("Details of the Flight : "+this.details);
        System.out.println("Ticket Price : "+this.amount);
    }
}
