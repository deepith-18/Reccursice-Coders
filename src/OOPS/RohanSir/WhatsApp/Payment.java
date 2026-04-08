package OOPS.RohanSir.WhatsApp;

public class Payment {
    String upi_id;
    int amount;

    Payment(String upi_id,int amount){
        this.upi_id=upi_id;
        this.amount=amount;
    }

    public void doPayment(){
        System.out.println("The amount :"+this.amount+"is transferred through id: "+this.upi_id);
    }
}
