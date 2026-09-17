package ManjunathSir;

public class Booking {

    int available=6;

    synchronized  void bookTicket(String user){
        if(available<0){
            System.out.println("Ticket Not available");
        }
        available--;
    }

}
