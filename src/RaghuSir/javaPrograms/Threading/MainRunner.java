package RaghuSir.javaPrograms.Threading;

public class MainRunner {

    public static void main(String[] args) {

        System.out.println("Main method Started");

        Example ex = new Example();
        Thread t1 = new Thread(){
            public void run(){
                ex.display();
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                ex.write();
            }
        };

        t1.start();
//        t1.start();   Illegal ThreadStateExceptionn
        t2.start();
        System.out.println("Main method Ended");
    }
}
