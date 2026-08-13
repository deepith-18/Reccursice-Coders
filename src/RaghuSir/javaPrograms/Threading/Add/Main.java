package RaghuSir.javaPrograms.Threading.Add;

public class Main {
    public static void main(String[] args) {

        Arithmetic a1 = new Arithmetic(10,20);

        Thread t1 = new Thread(){
            public void run(){
                a1.add();
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                a1.modify(100,200);
            }
        };

        t1.start();
        t2.start();
    }
}
