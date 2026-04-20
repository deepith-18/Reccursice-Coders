package RaghuSir.javaPrograms.String;

import java.util.Scanner;

public class CountOnllyAlphabets {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        int[] count = new int[26];

        for(int i=0;i<st.length();i++){

            char ch = st.charAt(i);
            if(ch>=65 && ch<=90)
                count[ch-65]++;
            else if(ch>=97 && ch<=122)
                count[ch-97]++;


        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0)
                System.out.println( (char) (i+65)+"->"+count[i]);
        }
    }
}