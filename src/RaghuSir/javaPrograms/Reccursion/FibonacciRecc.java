package RaghuSir.javaPrograms.Reccursion;

public class FibonacciRecc {
    public static void main(String[] args) {
       int fb = fibonacci(5);
        System.out.println("5 th fibonacci num is "+fb);
    }
    static int fibonacci(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }

        return fibonacci(n-1)+fibonacci(n-2);   }
}
