import java.util.Scanner;

public class NoteInWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        noteInWords(amount / 10000000, "Crore");
        noteInWords((amount / 100000) % 100, "Lakh");
        noteInWords((amount / 1000) % 100, "Thousand");
        noteInWords((amount / 100) % 10, "Hundred");

        if (amount > 100 && amount % 100 != 0) {
            System.out.print("and ");
        }

        noteInWords(amount % 100, "");

        System.out.println();
    }

    static void noteInWords(int n, String str) {

        if (n == 0)
            return;

        String[] x = {
                "", "One", "Two", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                "Seventeen", "Eighteen", "Nineteen"
        };

        String[] y = {
                "", "", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety"
        };

        if (n < 20) {
            System.out.print(x[n] + " ");
        } else {
            System.out.print(y[n / 10] + " " + x[n % 10] + " ");
        }

        System.out.print(str + " ");
    }
}