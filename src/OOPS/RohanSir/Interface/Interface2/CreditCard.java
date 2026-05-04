package OOPS.RohanSir.Interface.Interface2;

public class CreditCard implements Card {

    double amt;

    @Override
    public double checkBalance(){
        return amt;
    }

    @Override
    public double withdraw(double amount){
        if(amount >amt) {
            amt = amt - amount;
        }
        return amt;
    }
}
