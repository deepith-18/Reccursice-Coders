package GoDigit;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Strings {
    public static void main(java.lang.String[] args){
        java.lang.String s1="listen";
        java.lang.String s2 ="silent";

//        boolean ans = isAnagram(s1,s2);
//        System.out.println(ans);

//        char ans = findDuplicate("programming");
//        System.out.println(ans);

//        reverseWord("Java is Easy");

//        vowConsCount("DeepithN");

//        boolean ans = isRotated("Deeup","Deepu");
//        System.out.println(ans);

//        String name =largeWord("Java Spring Boot Microservices") ;
//        System.out.println(name);

//        toggleCase("DeEpItH");
        frequency("deepith");

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

    static boolean isPalindrome(String st){
        int left=0 , right=st.length()-1;

        while(left<right){
            if(st.charAt(left)!=st.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }

    static char nonRepeat(String st){
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);

            if(st.indexOf(ch)==st.lastIndexOf(ch)){
                return ch;
            }
        }
        return '@';
    }
    static String remDuplicate(String st){
        String res="";
        for(int i=0;i<st.length()-1;i++){
                char ch = st.charAt(i);

                if(res.indexOf(ch)==-1){
                    res+=ch;
                }
            }
    return res;
    }

    static char findDuplicate(String st){


        for(int i=0;i<st.length();i++){

            int count=0;
            for(int j=i+1;j<st.length();j++){

                if(st.charAt(i)==st.charAt(j)){
                    count++;
                }
            }
            if(count>0){
                System.out.println(st.charAt(i));
            }
        }
        return ' ';

    }

    static int occurance(String st,char target){
        int count=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)==target){
                count++;
            }
        }
        return 0;
    }

    static void reverseWord(String st){
        String [] words = st.split(" ");

        for(String word : words){

            for(int i=word.length()-1;i>=0;i--){
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }

    }

    static void vowConsCount(String st){
        int vCount=0;
        int cCount=0;
        for(int i=0;i<st.length();i++){
            st=st.toLowerCase();
            char ch = st.charAt(i);
            if(ch =='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'){
                vCount++;
            }else{
                cCount++;
            }
        }
        System.out.println("Number of Vowels :"+ vCount);
        System.out.println("Number of Consonants :"+cCount);

    }

    static boolean isRotated(String s1,String s2){
      if(s1.length()!=s2.length()){
          return false;
      }
      return (s1+s2).contains(s2);
    }

    static String longComPrefix(String[]words){
        String res="";
        String prefix = words[0];

        for(int i=1;i<words.length;i++){
            while(words[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }

    static String removeSpaces(String st){
        String res="";
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch!=' ') {
                res += ch;
            }
        }
        return res;
    }

    static String compression(String st){
        String res="";
        int count=1;
        for(int i=0;i<st.length()-1;i++){
           if(st.charAt(i)==st.charAt(i+1)){
               count++;
           }else{
               res +=st.charAt(i)+""+count;
               count=1;
           }
        }
        res+=st.charAt(st.length()-1) +""+count;
        return  res;

    }

    static String largeWord(String str){
        String [] words = str.split(" ");
        String largest = words[0];

        for(String word: words){
            if(word.length()>largest.length()){
                largest=word;
            }
        }
        return largest ;
    }

    static String removeSpecial(String str){
        String res="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                res+=ch;
            }
        }
        return res;
    }

    static String onlyDigit(String st){
        String res="";
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch>=48 && ch<=52){
                res+=ch;
            }
        }
        return res;
    }

    static void toggleCase(String str){
        String res="";
       for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(Character.isUpperCase(ch)){
               res+=Character.toLowerCase(ch);
           }else{
               res+=Character.toUpperCase(ch);
           }
       }
        System.out.println(res);
    }

    static  void frequency(String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(str.indexOf(ch)==i){
                int count=0;

                for(int j=0;j<str.length();j++){
                    if(str.charAt(j)==ch){
                        count++;
                    }
                }
                System.out.println(ch+" "+count);
            }
        }
    }

    static int longestSubstr(String str){
        int start=0;
        int end=0;
        int maxLength=0;
        List<Character> list = new ArrayList<Character>();

        while(end <str.length()){
            if(!list.contains(str.charAt(end))){
                list.add(str.charAt(end));
                maxLength = Math.max(maxLength,list.size());
                end++;
            }else{
                list.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
        }
        return maxLength;
    }

    static int longSubstr2(String s){
        int start=0;
        int end=0;
        int maxLen=0;

        Set<Character> set = new HashSet<>();
        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                maxLen = Math.max(maxLen,end-start+1);
                end++;
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLen;
    }







}
