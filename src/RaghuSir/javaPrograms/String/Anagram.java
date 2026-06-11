package RaghuSir.javaPrograms.String;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String st1 = sc.nextLine();
        System.out.println("Enter the String 2: ");
        String st2 = sc.nextLine();

        boolean ans = isAnagram(st1,st2);
        System.out.println(ans);


    }
    static boolean isAnagram(String st1,String st2){

        st1 = st1.toLowerCase();
        st2 = st2.toLowerCase();

        if(st1.length() != st2.length()){
            return false;
        }

        int [] count = new int[26];

        for(int i=0;i<st1.length();i++){
            count[st1.charAt(i)-'a']++;
            count[st2.charAt(i)-'a']--;
        }

        for(int x:count){
            if(x!=0){
                return false;
            }
        }
        return true;

    }
}
