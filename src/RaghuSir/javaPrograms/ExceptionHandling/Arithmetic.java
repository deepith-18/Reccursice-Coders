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
        }catch (InputMismatchException e){
            System.out.println("InputMismatch Exception");
        } catch(ArithmeticException e) {
            System.out.println("Second value not be zero");
        }
        System.out.println("Thank you....!s");
    }
}
