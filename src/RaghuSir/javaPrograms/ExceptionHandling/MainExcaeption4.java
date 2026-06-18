package RaghuSir.javaPrograms.ExceptionHandling;

public class MainExcaeption4 {
    public static void main(String[] args) {
        Exception e1 = new Exception();
        System.out.println(00e1);
        System.out.println(e1.getMessage());
        e1.printStackTrace();

        Exception e2 = new Exception("I am not good");
        System.out.println(e2);
        System.out.println(e2.getMessage());
        e2.printStackTrace();

    }
}
