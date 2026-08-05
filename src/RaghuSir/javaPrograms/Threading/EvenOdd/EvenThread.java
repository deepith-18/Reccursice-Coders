package RaghuSir.javaPrograms.Threading.EvenOdd;

public class EvenThread extends Thread {

    public void run(){
        for(int i=0;i<=50;i+=2){
            System.out.println(i);
        }
    }
}
