package RaghuSir.javaPrograms.Arrays;
public class Notes {
    public static void main(String[] args) {
        numberOfNotes(2838);
    }

    static void numberOfNotes(int n) {
        int five100 = 0, two100 = 0, one100 = 0, twen20 = 0, ten10 = 0, five = 0, two = 0, one1 = 0;

        five100 = n / 500;
        n = n % 500;

        two100 = n / 200;
        n = n % 200;

        one100 = n / 100;
        n = n % 100;

        twen20 = n / 20;
        n = n % 20;

        ten10 = n / 10;
        n = n % 10;

        two = n / 2;
        n = n % 2;

        one1 = n;

        System.out.println("Number 500 notes: " + five100);
        System.out.println("Number 200 notes: " + two100);
        System.out.println("Number 100 notes: " + one100);
        System.out.println("Number 20 notes: " + twen20);
        System.out.println("Number 10 notes: " + ten10);
        System.out.println("Number 2 notes: " + two);
        System.out.println("Number 1 notes: " + one1);
    }
}