package OOPS.RohanSir.WhatsApp;

public class WhatsApp {
    long num;
    String name;
    String msg;
    Payment p;

    WhatsApp(long num,String name){
        this.num=num;
        this.name=name;
    }

    public void msg(String msg){
        System.out.println("The message sent will be : "+msg);
    }

    public void doPayment(Payment p){
        System.out.println("The payment has done amount is: "+p.amount+" and Transaction id is : "+p.upi_id);
    }

}
