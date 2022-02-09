import java.util.ArrayList;
import java.util.Scanner;

public class AIRLINE {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, k, yes_no, ticket;
        String UserName, Gender, Phone_no;

        AIRLINE Admin1 = new AIRLINE();

        Ticket T1 = new Ticket();

        First_Class FC1 = new First_Class("Bangladesh To India", 23412, 60000.00);
        First_Class FC2 = new First_Class("Bangladesh To Bhutan", 674523, 120000.00);
        First_Class FC3 = new First_Class("Bangladesh To China", 345234, 90000.00);

        Economy_Class EC1 = new Economy_Class("Bangladesh To Nepal", 83242, 30000.00);
        Economy_Class EC2 = new Economy_Class("Bangladesh To Bhutan", 53242, 70000.00);
        Economy_Class EC3 = new Economy_Class("Bangladesh To China", 24532, 350000.00);

        Admin1.addFirstClass(FC1);
        Admin1.addFirstClass(FC2);
        Admin1.addFirstClass(FC3);
        Admin1.addEconomyClass(EC1);
        Admin1.addEconomyClass(EC2);
        Admin1.addEconomyClass(EC3);

        Help H1 = new Help();
        User U1 = new User();

        for (i = 0; ; i++) {

            System.out.println("\n\n***********************     ==================================     *************************");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>     AIRPLANE TICKET RESERVATION SYSTEM     <<<<<<<<<<<<<<<<<<<<<<<<<");
            System.out.println("***********************     ==================================     *************************\n\n");
            System.out.println("\t\t\t\t\t\t\t\t1. Show Available Tickets");
            System.out.println("\t\t\t\t\t\t\t\t2. Book Ticket");
            System.out.println("\t\t\t\t\t\t\t\t3. Show Booked Details");
            System.out.println("\t\t\t\t\t\t\t\t4. Update Booked Ticket");
            System.out.println("\t\t\t\t\t\t\t\t5. Delete Booked Ticket");
            System.out.println("\t\t\t\t\t\t\t\t6. Help");
            System.out.println("\t\t\t\t\t\t\t\t7. Exit The System");
            System.out.println("\n\n============================================================================================");
            System.out.print("\n\nPlease Enter Your Choice: ");

            j = input.nextInt();

            if (j == 1) {

                System.out.println("\n\t\t\t\t\t\t\t\t**Available Ticket Details**");
                System.out.println("\t\t\t\t\t\t\t\t============================\n\n");
                System.out.println("1. First Class");
                System.out.println("2. Economy Class\n");
                System.out.print("Choose Ticket Class: ");
                k = input.nextInt();

                if (k == 1) {
                    System.out.println("\n\t\t\t\t\t\t\t\t**Available Tickets of First Class**");
                    System.out.println("\t\t\t\t\t\t\t\t====================================\n\n");
                    System.out.println("  Flight Details         Flight ID      Ticket Price");
                    System.out.println("  ==============         =========      ============\n");
                    Admin1.First_Class_Display();

                } else if (k == 2) {
                    System.out.println("\n\t\t\t\t\t\t\t\t**Available Tickets of Economy Class**");
                    System.out.println("\t\t\t\t\t\t\t\t======================================\n\n");
                    System.out.println("  Flight Details         Flight ID      Ticket Price");
                    System.out.println("  ==============         =========      ============\n");
                    Admin1.Economy_Class_Display();
                }
            } else if (j == 2) {
                System.out.println("\n\n\t\t\t\t\t\t\t\t**Book Tickets**");
                System.out.println("\t\t\t\t\t\t\t\t================\n\n");
                System.out.println("1. First Class");
                System.out.println("2. Economy Class\n");
                System.out.print("Choose Ticket Class: ");
                k = input.nextInt();
                if (k == 1) {
                    System.out.println("\n\t\t\t\t\t\t\t\t**Available Tickets of First Class**");
                    System.out.println("\t\t\t\t\t\t\t\t====================================\n\n");
                    System.out.println("  Flight Details         Flight ID      Ticket Price");
                    System.out.println("  ==============         =========      ============\n");
                    Admin1.First_Class_Display();

                    System.out.println("\n\nDo You Want To Book A Ticket: ");
                    System.out.println("1. Yes\n2. No\n");

                    yes_no = input.nextInt();

                    if (yes_no == 1) {
                        System.out.print("\n\nWhich Ticket Do You Want To Buy: ");

                        ticket = input.nextInt();

                        if (ticket == 1) {
                            System.out.print("\nEnter UserName: ");
                            UserName = input.next();
                            U1.setName(UserName);
                            System.out.print("Enter User-Gender: ");
                            Gender = input.next();
                            U1.setGender(Gender);
                            System.out.print("Enter Phone Number: ");
                            Phone_no = input.next();
                            U1.setPhone_no(Phone_no);
                            Admin1.addReserve_FC(FC1);
                            System.out.println("\nTicket Booking Successful!!\n");
                        }
                        if (ticket == 2) {
                            System.out.print("\nEnter UserName: ");
                            UserName = input.next();
                            U1.setName(UserName);
                            System.out.print("Enter User-Gender: ");
                            Gender = input.next();
                            U1.setGender(Gender);
                            System.out.print("Enter Phone Number: ");
                            Phone_no = input.next();
                            U1.setPhone_no(Phone_no);
                            Admin1.addReserve_FC(FC2);
                            System.out.println("\nTicket Booking Successful!!\n");
                        }
                        if (ticket == 3) {
                            System.out.print("\nEnter UserName: ");
                            UserName = input.next();
                            U1.setName(UserName);
                            System.out.print("Enter User-Gender: ");
                            Gender = input.next();
                            U1.setGender(Gender);
                            System.out.print("Enter Phone Number: ");
                            Phone_no = input.next();
                            U1.setPhone_no(Phone_no);
                            Admin1.addReserve_FC(FC3);
                            System.out.println("\nTicket Booking Successful!!\n");
                        }
                    }
                } else if (k == 2) {
                    System.out.println("\n\t\t\t\t\t\t\t\t**Available Tickets of First Class**");
                    System.out.println("\t\t\t\t\t\t\t\t====================================\n\n");
                    System.out.println("  Flight Details         Flight ID      Ticket Price");
                    System.out.println("  ==============         =========      ============\n");
                    Admin1.First_Class_Display();

                    System.out.println("\n\nDo You Want To Book A Ticket: ");
                    System.out.println("1. Yes\n2. No\n");

                    yes_no = input.nextInt();

                    if (yes_no == 1) {
                        System.out.print("\n\nWhich Ticket Do You Want To Buy: ");

                        ticket = input.nextInt();

                        if (ticket == 1) {
                            System.out.print("\nEnter UserName: ");
                            UserName = input.next();
                            U1.setName(UserName);
                            System.out.print("Enter User-Gender: ");
                            Gender = input.next();
                            U1.setGender(Gender);
                            System.out.print("Enter Phone Number: ");
                            Phone_no = input.next();
                            U1.setPhone_no(Phone_no);
                            Admin1.addReserve_EC(EC1);
                            System.out.println("\nTicket Booking Successful!!\n");
                        }
                        if (ticket == 2) {
                            System.out.print("\nEnter UserName: ");
                            UserName = input.next();
                            U1.setName(UserName);
                            System.out.print("Enter User-Gender: ");
                            Gender = input.next();
                            U1.setGender(Gender);
                            System.out.print("Enter Phone Number: ");
                            Phone_no = input.next();
                            U1.setPhone_no(Phone_no);
                            Admin1.addReserve_EC(EC2);
                            System.out.println("\nTicket Booking Successful!!\n");
                        }
                        if (ticket == 3) {
                            System.out.print("\nEnter UserName: ");
                            UserName = input.next();
                            U1.setName(UserName);
                            System.out.print("Enter User-Gender: ");
                            Gender = input.next();
                            U1.setGender(Gender);
                            System.out.print("Enter Phone Number: ");
                            Phone_no = input.next();
                            U1.setPhone_no(Phone_no);
                            Admin1.addReserve_EC(EC3);
                            System.out.println("\nTicket Booking Successful!!\n");
                        }
                    }
                }
            } else if (j == 3) {
                System.out.println("\n\t\t\t\t\t\t\t\t**Show Booked Details**\n\n");
                System.out.println("User Information : ");
                System.out.print("==================");
                U1.User_Display();

                System.out.println("\nFlight Details         Flight ID      Ticket Price");
                System.out.println("==============         =========      ============\n");
                Admin1.Display_Reserve_EC();
                Admin1.Display_Reserve_FC();

            } else if (j == 4) {
                System.out.println("\n\t\t\t\t\t\t\t\t**Update Booked Ticket**\n\n");

                System.out.println("Do You Want To Edit/Update Your Booked Ticket?1. Yes    2.No");
                yes_no = input.nextInt();
                if (yes_no == 1) {
                    Admin1.removeReserve_FC(FC1);
                    Admin1.removeReserve_FC(FC2);
                    Admin1.removeReserve_FC(FC3);
                    Admin1.removeReserve_EC(EC1);
                    Admin1.removeReserve_EC(EC2);
                    Admin1.removeReserve_EC(EC3);

                    System.out.println("\n\n\t\t\t\t\t\t\t\t**Book Tickets**");
                    System.out.println("\t\t\t\t\t\t\t\t================\n\n");
                    System.out.println("1. First Class");
                    System.out.println("2. Economy Class\n");
                    System.out.print("Choose Ticket Class: ");
                    k = input.nextInt();
                    if (k == 1) {
                        System.out.println("\n\t\t\t\t\t\t\t\t**Available Tickets of First Class**");
                        System.out.println("\t\t\t\t\t\t\t\t====================================\n\n");
                        System.out.println("  Flight Details         Flight ID      Ticket Price");
                        System.out.println("  ==============         =========      ============\n");
                        Admin1.First_Class_Display();

                        System.out.println("\n\nDo You Want To Book A Ticket: ");
                        System.out.println("1. Yes\n2. No\n");

                        yes_no = input.nextInt();

                        if (yes_no == 1) {
                            System.out.print("\n\nWhich Ticket Do You Want To Buy: ");

                            ticket = input.nextInt();

                            if (ticket == 1) {
                                Admin1.addReserve_FC(FC1);
                                System.out.println("\nTicket Booking Successful!!\n");
                            }
                            if (ticket == 2) {
                                Admin1.addReserve_FC(FC2);
                                System.out.println("\nTicket Booking Successful!!\n");
                            }
                            if (ticket == 3) {
                                Admin1.addReserve_FC(FC3);
                                System.out.println("\nTicket Booking Successful!!\n");
                            }
                        }
                    } else if (k == 2) {
                        System.out.println("\n\t\t\t\t\t\t\t\t**Available Tickets of First Class**");
                        System.out.println("\t\t\t\t\t\t\t\t====================================\n\n");
                        System.out.println("  Flight Details         Flight ID      Ticket Price");
                        System.out.println("  ==============         =========      ============\n");
                        Admin1.First_Class_Display();

                        System.out.print("\n\nDo You Want To Book A Ticket: ");
                        System.out.println("    1. Yes  2. No\n");

                        yes_no = input.nextInt();

                        if (yes_no == 1) {
                            System.out.print("\n\nWhich Ticket Do You Want To Buy: ");

                            ticket = input.nextInt();

                            if (ticket == 1) {
                                Admin1.addReserve_EC(EC1);
                                System.out.println("\nTicket Booking Successful!!\n");
                            }
                            if (ticket == 2) {
                                Admin1.addReserve_EC(EC2);
                                System.out.println("\nTicket Booking Successful!!\n");
                            }
                            if (ticket == 3) {
                                Admin1.addReserve_EC(EC3);
                                System.out.println("\nTicket Booking Successful!!\n");
                            }
                        }
                    }
                }
            } else if (j == 5) {
                System.out.println("\n\t\t\t\t\t\t\t\t**Delete Booked Ticket**\n\n");
                System.out.println("User Information : ");
                System.out.print("==================");
                U1.User_Display();

                System.out.println("\nFlight Details         Flight ID      Ticket Price");
                System.out.println("==============         =========      ============\n\n");
                Admin1.Display_Reserve_EC();
                Admin1.Display_Reserve_FC();

                System.out.println("\nDo You Want To Delete Your Booked Ticket?    1. Yes   2. No\n");
                yes_no = input.nextInt();
                if (yes_no == 1) {
                    Admin1.removeReserve_FC(FC1);
                    Admin1.removeReserve_FC(FC2);
                    Admin1.removeReserve_FC(FC3);

                    Admin1.removeReserve_EC(EC1);
                    Admin1.removeReserve_EC(EC2);
                    Admin1.removeReserve_EC(EC3);

                    System.out.println("\nSuccessfully Deleted Your Booked Ticket");
                }
            } else if (j == 6) {
                System.out.println("\n\t\t\t\t\t\t\t\t**   Help    **\n\n");
                H1.Help_Display();
            } else if (j == 7) {
                System.out.println("\n\t\t\t\t\t\t\t\tSee You Again!!  Have A Safe Journey!! :):)\n\n");
                break;
            }
        }
    }

    public ArrayList<First_Class> FirstClass_list = new ArrayList<>();
    public ArrayList<First_Class> Reserve_FC = new ArrayList<>();
    public ArrayList<Economy_Class> EconomyClass_list = new ArrayList<>();
    public ArrayList<Economy_Class> Reserve_EC = new ArrayList<>();

    public AIRLINE() {

    }

    public void addFirstClass(First_Class FC) {
        FirstClass_list.add(FC);
    }

    public void addEconomyClass(Economy_Class FC) {
        EconomyClass_list.add(FC);
    }

    public void addReserve_FC(First_Class FC) {
        Reserve_FC.add(FC);
    }

    public void addReserve_EC(Economy_Class EC) {
        Reserve_EC.add(EC);
    }

    public void removeReserve_FC(First_Class FC) {
        Reserve_FC.remove(FC);
    }

    public void removeReserve_EC(Economy_Class EC) {
        Reserve_EC.remove(EC);
    }

    public void Display_Reserve_FC() {
        for (First_Class FC : Reserve_FC) {
            FC.First_Class_Display();
        }
    }

    public void Display_Reserve_EC() {
        for (Economy_Class EC : Reserve_EC) {
            EC.Economy_Class_Display();
        }
    }

    public void First_Class_Display() {
        for (First_Class FC : FirstClass_list) {
            FC.First_Class_Display();
        }
    }

    public void Economy_Class_Display() {
        for (Economy_Class EC : EconomyClass_list) {
            EC.Economy_Class_Display();
        }
    }
}
