package OOPS.RohanSir.Encapsulation;

public class AtmMain {
    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.setBalance(5000);
        atm.setPin(1121);
        System.out.println(atm.getBalance());
        System.out.println(atm.getPin());
    }
}
