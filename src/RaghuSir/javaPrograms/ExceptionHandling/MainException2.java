package RaghuSir.javaPrograms.ExceptionHandling;

public class MainException2 {
    public static void main(String[] args) {

        int[]arr= {23,45,56,44};
        int val=4;
        try{
            for(int i=0;i<arr.length;i++){
                int q = val/arr[i];
                System.out.println(q);
            }
        }finally {
            System.out.println("Im Final");
        }
        System.out.println("Thank you ///..");
    }
}
