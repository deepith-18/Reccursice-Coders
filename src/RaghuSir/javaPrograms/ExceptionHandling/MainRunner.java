package RaghuSir.javaPrograms.ExceptionHandling;

public class MainRunner {

    private int x=10;

    class First{
        private int x=20;
        void m1(){
            int x=30;
            System.out.println(x);//30
            System.out.println(this.x);//20
            System.out.println(MainRunner.this.x);//10
        }
    }

    public static void main(String[] args) {
        First f = new MainRunner().new First();
        f.m1();
    }
}
