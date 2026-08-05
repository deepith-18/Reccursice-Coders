package RaghuSir.javaPrograms.Threading;

public class SmallThread extends Thread{

    public void run(){
        for(int i=97; i<=122; i++){
            System.out.println((char)i+" ");

            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
