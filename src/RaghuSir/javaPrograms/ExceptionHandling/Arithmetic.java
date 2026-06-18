package RaghuSir.javaPrograms.ExceptionHandling;
import java.util.*;
public class Arithmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the value Of a: ");
            int a = sc.nextInt();
            System.out.println("Enter the value of b: ");
            int b = sc.nextInt();
            int q=a/b;
            System.out.println("Quotiont is : "+q);
        }catch (InputMismatchException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            if(e instanceof InputMismatchException){
                System.out.println("Input must be Integer");
            }else if(e instanceof ArithmeticException){
                System.out.println("Second value should not be zero");
            }else{
                System.out.println("Index not in the range");
            }
        }
        System.out.println("Thank you....!s");
    }
}
