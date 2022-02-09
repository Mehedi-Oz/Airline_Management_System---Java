public class Help {
    public String getHelp;

    public Help() {

    }

    public Help(String getHelp) {
        this.getHelp = getHelp;
    }

    public String getGetHelp() {
        return getHelp;
    }

    public void setGetHelp(String getHelp) {
        this.getHelp = getHelp;
    }

    public void Help_Display() {
        System.out.println("Welcome to our system. You see available tickets by entering 1 in the main menu.\nIf you enter 2 you can book your desired ticket.\nBy entering 3 you can see your booking status.\nThen if you want to edit or update your ticket you will have to enter 4.\nIn the number 5 section you can delete your booked ticket.\nBy entering 7 you can exit the system.\n");
    }
}
