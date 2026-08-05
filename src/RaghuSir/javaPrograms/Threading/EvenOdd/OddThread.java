package RaghuSir.javaPrograms.Threading.EvenOdd;

public class OddThread  extends Thread{

    public void run(){
        for(int i=1;i<=50;i+=2){
            System.out.println(i);
        }
    }
}
