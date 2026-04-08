package OOPS.RohanSir.Application;

public class Main {

    public static void main(String[] args) {

        Application a = new Application();
        a.login();

        KSRTC bus = new KSRTC();
        bus.login();
        bus.bookBusSeat();

        IRCTC train = new IRCTC();
        train.login();
        train.bookTrainSeat();
    }
}
