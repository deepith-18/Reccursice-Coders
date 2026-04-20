package RaghuSir.javaPrograms.String;
import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();

        boolean rs = isPangram(st);
        if(rs)
            System.out.println("True Pangram");
        else
            System.out.println("False Not Pangram");
    }

    static boolean isPangram(String st){
        if(st.length() < 26){
            return false;
        }

        int[] count = new int[26];

        for(int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);

            if(ch >= 'A' && ch <= 'Z')
                count[ch - 'A']++;
            else if(ch >= 'a' && ch <= 'z')
                count[ch - 'a']++;
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] == 0)
                return false;
        }

        return true;
    }

    static boolean isPan2(String st){
        if(st.length()<26) {
            return false;
        }
            st = st.toLowerCase();

        for(char ch='a';ch<='z';ch++){
            if(st.indexOf(ch)==-1){
                return false;
            }
        }
        return true;
    }
}