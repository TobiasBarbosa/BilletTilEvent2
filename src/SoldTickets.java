import java.util.ArrayList;
import java.util.Collections;

public class SoldTickets {

    //***ATTRIBUTES***--------------------------------------------------------------------------------------------------
    private ArrayList<Ticket> soldTicketsList;

    private int ticketDoorCount;
    private int ticketPreSaleCount;
    private int ticketStudentCount;

    //***CONSTRUCTOR***-------------------------------------------------------------------------------------------------
    public SoldTickets(){
        soldTicketsList = new ArrayList<>();
        ticketDoorCount = 0;
        ticketPreSaleCount = 0;
        ticketStudentCount = 0;
    }

    //***METHODS***-----------------------------------------------------------------------------------------------------
    public void addSoldTickets(Ticket ticket){
        soldTicketsList.add(ticket);

        if (ticket instanceof TicketDoor) {
            ticketDoorCount++;
        } else if (ticket instanceof TicketPreSale) {
            ticketPreSaleCount++;
        } else if(ticket instanceof TicketStudent){
            ticketStudentCount++;
        }
    }

    public void printTicketCounts() {
        System.out.println("TICKET COUNT:");
        System.out.println("TICKET FROM DOOR: "    + ticketDoorCount);
        System.out.println("TICKET FROM PRESALE: " + ticketPreSaleCount);
        System.out.println("TICKET FROM STUDENT: " + ticketStudentCount);
    }

    public String getAllStudentId() {
        String result = "Student ID for sold student tickets \n";
        ArrayList<String> studentId = new ArrayList<>();
        for (Ticket ticket : soldTicketsList) {
            if (ticket instanceof TicketStudent) {
                studentId.add(((TicketStudent) ticket).getStudentId());
            }
            Collections.sort(studentId);
        }
        for (String id : studentId) {
            result += id + "\n";
        }
        return result;
    }

    //***TO STRING METHOD***--------------------------------------------------------------------------------------------
    @Override
    public String toString(){
        return "hej";
    }

    //------------------------------------------------------------------------------------------------------------------
}
