package OOPS.RohanSir.WhatsApp;

public class Main {
    public static void main(String[] args) {
        Payment p=new Payment("sdj13e32sa",1000);
        WhatsApp w = new WhatsApp(8618287891l,"Sheeh");
        w.doPayment(new Payment("fjnvso23r",2000));
        w.msg("Hi there!");
        p.doPayment();
    }
}
