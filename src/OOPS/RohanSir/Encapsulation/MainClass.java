package OOPS.RohanSir.Encapsulation;

public class MainClass {
    public static void main(String[] args) {

        Account a1 = new Account();
        System.out.println(a1.getName());
        System.out.println(a1.getBalance());
        a1.setName("Anonymous");
        a1.setBalance(2000.0);
        System.out.println(a1.getName());
        System.out.println(a1.getBalance());

    }
}
