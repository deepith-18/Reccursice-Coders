package OOPS.RohanSir.Interface.Interface2;

public class MainClass {
    public static void main(String[] args) {

        CreditCard cc= new CreditCard();
        cc.amt = 1200.0;
        System.out.println(cc.checkBalance());
        cc.withdraw(500);

        DebitCard dc = new DebitCard();
        dc.balanceAmount=2000;
        System.out.println(dc.checkBalance());;
        dc.withdraw(1500);

    }
}
