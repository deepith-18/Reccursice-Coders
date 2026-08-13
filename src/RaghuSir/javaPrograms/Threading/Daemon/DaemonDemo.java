package RaghuSir.javaPrograms.Threading.Daemon;

public class DaemonDemo extends Thread {

    public void run(){
        while(true){

            System.out.println(Thread.currentThread().getName()+"is running..");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        DaemonDemo d = new DaemonDemo();
        d.setDaemon(true);
        d.start();
        Thread.sleep(5000);
        System.out.println("Main thread is ending:");
    }
}
