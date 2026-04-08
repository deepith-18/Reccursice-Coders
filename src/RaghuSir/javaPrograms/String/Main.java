package RaghuSir.javaPrograms.String;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int vc=0,cc=0,uc=0,lc=0,dc=0,spc=0;

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                uc++;
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vc++;
                } else {
                    cc++;
                }
            } else if (ch >= 'a' && ch <= 'z') {
                lc++;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vc++;
                } else {
                    cc++;
                }
            } else if (ch >= 48 && ch <= 57) {
                dc++;
            } else {
                spc++;
            }
        }

        System.out.println("Vowels count: "+vc);
        System.out.println("Consonants count: "+cc);
        System.out.println("UpperCase count: "+uc);
        System.out.println("LowerCase count: "+lc);
        System.out.println("Digits count: "+dc);
        System.out.println("Special character count: "+spc);

// Done now
    }
}
