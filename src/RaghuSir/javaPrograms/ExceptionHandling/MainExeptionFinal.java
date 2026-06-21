package RaghuSir.javaPrograms.ExceptionHandling;

public class MainExeptionFinal {
    static void display(){
        int a =100;
        int b=20;
        try{
            int q=a/b;
            System.out.println(q);
            System.exit(0);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured");
        }finally {
            System.out.println("Finally block");
        }
        System.out.println("Thank you...");

    }

    public static void main(String[] args) {
        System.out.println("Method started");
        display();
        System.out.println("Method ended");
    }
}
