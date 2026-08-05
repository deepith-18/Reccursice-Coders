package AdvanceJava;

public class NotificationFactory {

    public static Notification getNotification(String message){

        if(message.equalsIgnoreCase(message)){
            return new EmailNotification();
        }else if(message.equalsIgnoreCase(message)){
            return new WhatsAppNotification();
        }else if (message.equalsIgnoreCase(message)){
            return  new TextNotification();
        }
        return null;
    }
}
