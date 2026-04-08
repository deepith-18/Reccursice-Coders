package OOPS.RohanSir.Bank;

public class Account {

    long accno;
    double bal;

    Account(long accno,double bal){
        this.accno=accno;
        this.bal=bal;
    }

    public void deposit(double amount){
        bal = bal+amount;
        System.out.println("Account balance is : "+ this.bal);
    }

    public double withdraw(double amount){
        if(bal<amount){
            System.out.println("Insufficient balance");
            return 0;
        }else {
            bal = bal - amount;
            System.out.println("You have withdrawed : "+amount);
        }
        return amount;
    }
}
