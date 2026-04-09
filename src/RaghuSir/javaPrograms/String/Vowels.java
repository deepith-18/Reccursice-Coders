package RaghuSir.javaPrograms.String;

public class Vowels {
    public static void main(String[] args) {
        String ans="Deepu";
        int answer = countVowels(ans);
        System.out.println(answer);
    }
    static int countVowels(String st){
        int vc=0;
        String v = "AEIOUaeiou";
        for(char ch : st.toCharArray()){
            if(v.indexOf(ch)!=-1){
                vc++;
            }
        }
        return vc;
    }
}
