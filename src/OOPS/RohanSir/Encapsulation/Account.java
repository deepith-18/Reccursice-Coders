package OOPS.RohanSir.Encapsulation;

import java.io.Serializable;

public class Account  implements Serializable {              // public class

    private String name;
    private double balance;

    Account(){}                                 // Zero parameterized method

    public String getName(){  // getter()
        return this.name;
    }
    public void  setName(String name){   //setter()
        this.name=name;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

}
