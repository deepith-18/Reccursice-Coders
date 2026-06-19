package RaghuSir.javaPrograms.ExceptionHandling;

import java.util.Scanner;

public class MainException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        try{
            if(age <18){
                throw new RuntimeException("Not eligible for vote");
            }
            throw new ArithmeticException("Can able to marry");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
