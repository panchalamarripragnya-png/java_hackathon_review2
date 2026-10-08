import java.util.Scanner;

class MovieTicket {
    // Data members
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Parameterized constructor
    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Method to calculate total ticket amount
    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    // Method to calculate discount
    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10; // 10% discount
        } else {
            return 0.0;
        }
    }

    // Method to calculate final amount
    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    // Method to display the complete booking bill
    public void displayBill() {
        System.out.println("\n--- Cinema Ticket Booking Bill ---");
        System.out.println("Movie Name        : " + movieName);
        System.out.printf("Ticket Price      : ₹%.2f\n", ticketPrice);
        System.out.println("Number of Tickets : " + numberOfTickets);
        System.out.printf("Total Amount      : ₹%.2f\n", calculateTotal());
        System.out.printf("Discount          : ₹%.2f\n", calculateDiscount());
        System.out.printf("Final Amount      : ₹%.2f\n", calculateFinalAmount());
        System.out.println("----------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input values
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter Ticket Price: ");
        double ticketPrice = scanner.nextDouble();

        System.out.print("Enter Number of Tickets: ");
        int numberOfTickets = scanner.nextInt();

        // Creating MovieTicket object using parameterized constructor
        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);

        // Displaying the final bill
        ticket.displayBill();

        scanner.close();
    }
}