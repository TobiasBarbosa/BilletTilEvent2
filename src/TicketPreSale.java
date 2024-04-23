import java.time.LocalDate;

public class TicketPreSale implements Ticket {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private int ticketId;
    private String eventName;
    private double price;
    private LocalDate eventDate;
    private LocalDate purchaseDate;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public TicketPreSale(int ticketId, String eventName, LocalDate eventDate, LocalDate purchaseDate){
        this.ticketId = ticketId;
        this.eventDate = eventDate;
        this.purchaseDate = purchaseDate;
        this.price = calculatePrice();
    }

    //***GETTER METHODS***----------------------------------------------------------------------------------------------
    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public int getTicketId(){
        return ticketId;
    }

    //***OTHER METHODS***-----------------------------------------------------------------------------------------------
    private int calculatePrice() {
        // Check if the event is more than 10 days away from the purchase date
        if (purchaseDate.plusDays(10).isBefore(eventDate)) {
            // Apply 15% discount
            return (int) (120 * 0.85);
        } else {
            return 120; // No discount
        }
    }

    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    @Override
    public String toString(){
        return "******************\n"  +
                "\nTicket ID: "        + ticketId     +
                "\nEvent: "            + eventName    +
                "\nEvent Date: "       + eventDate    +
                "\nPrice for ticket: " + price        +
                "\nPurchase Date: "    + purchaseDate +
                "\n******************";
    }

    //------------------------------------------------------------------------------------------------------------------
}
