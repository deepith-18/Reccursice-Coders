package RaghuSir.javaPrograms.Threading;

public class Example {

    public void display(){
        for(int i = 0; i <=5; i++){
            System.out.println("Diplay: "+i);

            if(i==3){
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    System.out.println(e);
                }
            }
        }
    }

    public void write(){
        for(int i=0; i<=5; i++){
            System.out.println("write: "+i);
        }
    }
}
