package AdvanceJava;

public class Main {

    public static void main(String[] args) {

        Notification n = NotificationFactory.getNotification("Email");
        n.getNotification();
    }

}
