import java.util.Scanner;
class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;
    MovieTicket(String name, double price, int tickets) {
        movieName = name;
        ticketPrice = price;
        numberOfTickets = tickets;
    }
    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }
    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }
    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }
    void displayBill() {
        double total = calculateTotal();
        double discount = calculateDiscount();
        double finalAmount = calculateFinalAmount();
        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket Price: " + (ticketPrice * 100.0) / 100.0);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Amount: " + (total * 100.0) / 100.0);
        System.out.println("Discount: " + (discount * 100.0) / 100.0);
        System.out.println("Final Amount: " + (finalAmount * 100.0) / 100.0);
    }
}
public class hackathon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String name = sc.nextLine();
        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();
        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();
        MovieTicket ticket = new MovieTicket(name,price,tickets);
        System.out.println();
        ticket.displayBill();
        sc.close();
    }
}
