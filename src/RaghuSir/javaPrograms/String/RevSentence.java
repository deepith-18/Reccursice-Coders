package RaghuSir.javaPrograms.String;
import java.util.Scanner;
public class RevSentence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String str = sc.nextLine();
        String res = "";
        char[] ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){

            int l=i;

            while(i>=0 && ch[i]!=' '){
                i--;
            }
            int f = i+1;

            while(f<=l){
                res = res+ch[f];
                f++;
            }
            if(i>=0){
                res+=ch[i];
            }

        }
        System.out.println(res);
    }
}
