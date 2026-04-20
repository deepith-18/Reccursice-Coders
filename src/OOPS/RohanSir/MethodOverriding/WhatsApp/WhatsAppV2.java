package OOPS.RohanSir.MethodOverriding.WhatsApp;

public class WhatsAppV2 extends WhatsAppV1{

    @Override
    public void message(){
        System.out.println("Send photos with message");
    }

    public void call(){
        System.out.println("Ready to do audio call");
    }
}
