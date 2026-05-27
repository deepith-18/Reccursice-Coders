package OOPS.RohanSir.Encapsulation;

public class ATM {

    private double balance;
    private int pin;

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        if(balance >0 && balance%100==0){
            this.balance=balance;
        }else{
            System.out.println("Only multiples of 100");
        }
    }

    public int getPin(){
        return  this.pin;
    }

    public void setPin(int pin){
        String pint= pin+"";
        if(pint.length()==4){
            this.pin=pin;
        }else {
            System.out.println("The pin should be length 4");
        }
    }


}
