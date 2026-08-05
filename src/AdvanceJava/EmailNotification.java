package AdvanceJava;

public class EmailNotification implements Notification {

    @Override
    public void getNotification() {
        System.out.println("send notification through email");
    }
}
