package RaghuSir.javaPrograms.StreamAPI;

public class Main3 {
    public static void main(String[] args) {

        int num = 23212;

        // Sum of Digits in the number
        int sum = Integer.toString(num).chars().map( c->c-48).sum();
        System.out.println(sum);
    }
}
