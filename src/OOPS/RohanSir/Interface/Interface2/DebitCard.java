package OOPS.RohanSir.Interface.Interface2;

public class DebitCard implements Card {

    double balanceAmount;

    @Override
    public double checkBalance(){
        return balanceAmount;
    }

    @Override
    public double withdraw(double amt){
        if(amt>balanceAmount) {
            balanceAmount = balanceAmount - amt;
        }
        return balanceAmount;
    }
}
