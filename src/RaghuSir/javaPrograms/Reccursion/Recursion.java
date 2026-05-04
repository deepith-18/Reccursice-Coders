package RaghuSir.javaPrograms.Reccursion;

public class Recursion {
    public static void main(String[] args) {
//        display(5);
        write(5);
    }
    static  void display(int n){
        System.out.println(n);
        if(n>1)
            display(n-1);
    }
    static void write(int n){
        if(n>1)
            write(n-1);

        System.out.println(n);
    }


}
