package OOPS.RohanSir.MultipleInheritance.MI1;

public class WhatsApp implements Payment,Communication {
    @Override
    public void doPayment(){
        System.out.println("Payment Successfull");
    }

    @Override
    public void message(){
        System.out.println("Message Sent");
    }

}
