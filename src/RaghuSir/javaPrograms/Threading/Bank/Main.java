package RaghuSir.javaPrograms.Threading.Bank;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Bank b =  new Bank();

        Thread t1 = new Thread(){
            @Override
            public void run(){
                b.withDrawMoney(6000);
            }
        };


        Thread t2 = new Thread(){
            @Override
            public void run(){
                b.depositMoney(3000);
            }
        };
        t1.start();
        Thread.sleep(10000);
        t2.start();
        Thread t3 = new Thread(){
            @Override
            public void run(){
                b.depositMoney(4000);
            }
        };
        Thread.sleep(5000);
        t3.start();
    }
}
