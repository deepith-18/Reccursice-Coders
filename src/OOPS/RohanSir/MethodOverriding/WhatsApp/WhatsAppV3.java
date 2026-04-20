package OOPS.RohanSir.MethodOverriding.WhatsApp;

public class WhatsAppV3 extends  WhatsAppV2{

    @Override
    public void message(){
        super.message();
        super.call();
        System.out.println("Send videos with message");
    }

    @Override
    public void call(){
        super.message();
        super.call();
        System.out.println("On video call with audio call");
    }
}
