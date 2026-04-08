package RaghuSir.javaPrograms;
import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the digit: ");
        int digit = sc.nextInt();
        Random rd = new Random();
        int num = rd.nextInt(10);
        if(digit == num){
            System.out.println("Number guessed is correct");
        }else{
            System.out.println("No try again");
        }
    }
}
