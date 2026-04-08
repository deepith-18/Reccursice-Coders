package OOPS.RohanSir.Bank;


public class Main {
    public static void main(String[] args) {
        Account acc = new Account(23235324l,0);
        Person p = new Person("Pavan",acc);

        acc.deposit(1000);
        acc.withdraw(100);
        System.out.println(acc.bal);
    }



}
