package RaghuSir.javaPrograms.ExceptionHandling;

import java.util.Scanner;


public class MainException3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerator");
        int num= sc.nextInt();
        System.out.println("Enter the denominator");
        int den=sc.nextInt();
        if(den == 0){
            throw new ArithmeticException();
        }
        int q = num/den;
        System.out.println("Quotent is "+q);

        System.out.println("Thank you ..");
    }
}
