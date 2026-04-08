package OOPS.RohanSir.Inheritance.MultiLevelInheritance;

public class MainClass {
    public static void main(String[] args) {

        WhatsApp1 v1 = new WhatsApp1();
        v1.msg();

        WhatsApp2 v2 = new WhatsApp2();
        v2.msg();
        v2.call();

        WhatsApp3 v3 = new WhatsApp3();
        v3.msg();
        v3.call();
        v3.doPayment();
    }
}
