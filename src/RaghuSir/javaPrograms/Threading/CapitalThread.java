package RaghuSir.javaPrograms.Threading;

public class CapitalThread extends Thread{

    public void run(){
        for(int i=65;i<=90;i++){
            System.out.print((char)i+" ");

            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
