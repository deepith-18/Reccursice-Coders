package RaghuSir.javaPrograms.Threading.Bank;

public class Bank {

    int balance = 5000;

    synchronized void withDrawMoney(int amount) {
        if(balance-100 <= amount){
            balance -= amount;
            System.out.println("Withdraw Money Successfully "+amount);
        }else{
            System.out.println("insufficient balance");
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            withDrawMoney(amount);
        }
    }
    synchronized void depositMoney(int amount) {
        balance += amount;
        System.out.println("Deposit Money Successfully "+amount);
        notify();
    }
}
