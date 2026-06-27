import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        int ticketNo, numberOfTickets, price, totalAmount, choice;
        String customerName;
        String movieName;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ticket Booking System ");
        System.out.print("Enter Ticket Number: ");
        ticketNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();
        System.out.print("Enter Movie/Event Name: ");
        movieName = sc.nextLine();
        System.out.print("Enter Number of Tickets: ");
        numberOfTickets = sc.nextInt();
        System.out.print("Enter Ticket Price: ");
        price = sc.nextInt();
        totalAmount = numberOfTickets * price;
        System.out.println("\n1. Confirm Booking");
        System.out.println("2. Display Ticket Details");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Ticket Booked Successfully!");
                System.out.println("Total Amount: " + totalAmount);
                break;
            case 2:
                System.out.println("\n--- Ticket Details ---");
                System.out.println("Ticket Number : " + ticketNo);
                System.out.println("Customer Name : " + customerName);
                System.out.println("Movie/Event   : " + movieName);
                System.out.println("Tickets       : " + numberOfTickets);
                System.out.println("Total Amount  : " + totalAmount);
                break;
            case 3:
                System.out.println("Exiting Program...");
                break;
            default:
                System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}