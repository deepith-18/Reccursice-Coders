package RaghuSir.javaPrograms.String;
import java.util.Scanner;
public class StringDay3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str = sc.nextLine();
//        str = str.toUpperCase();
//        System.out.println(str);

        char [] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                ch[i]=(char)(ch[i]-32);
            }
        }
        new String(ch);
        System.out.println(str);

    }

//    static String toUpper(String st){
//        String ans = "";
//
//        for(int i = 0; i < st.length(); i++){
//            char ch = st.charAt(i);
//
//            if(ch >= 'a' && ch <= 'z'){
//                ans = ans + (char)(ch - 32);
//            } else {
//                ans = ans + ch;
//            }
//        }
//        return ans;
//    }
}
