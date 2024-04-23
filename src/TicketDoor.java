import java.time.LocalDate;

public class TicketDoor implements Ticket {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private int ticketId;
    private String eventName;
    private double price;
    private LocalDate eventDate;
    private LocalDate purchaseDate;

    public TicketDoor(int ticketId, String eventName,LocalDate eventDate){
        this.ticketId = ticketId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.purchaseDate = eventDate; //Will always be the same day as the event
        price = 150;
    }

    //***GETTER METHOD***-----------------------------------------------------------------------------------------------
    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public int getTicketId(){
        return ticketId;
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
