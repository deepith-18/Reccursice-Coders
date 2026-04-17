package OOPS.RohanSir.NonPrimitiveTypeasting;

public class Bus extends Vehicle {

    double ticketPrice;

    Bus(String brand, double price, double ticketPrice){
        super(brand,price);
        this.ticketPrice=ticketPrice;

    }

    public void buyTicket(){
        System.out.println("Bought Train ticket");
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
}
