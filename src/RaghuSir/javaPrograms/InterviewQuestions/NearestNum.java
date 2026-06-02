package RaghuSir.javaPrograms.InterviewQuestions;

public class NearestNum {
    public static void main(String[] args) {

    }
    static int nearBig(int n,int k){
        String st = String.valueOf(n);
        int big = Integer.MAX_VALUE;
        for(int i=1;i<1<<st.length();i++){
            int v=i;
            int num = 0;
            int j=0;
            while(v!=0){
                if(v%2==1){
                    num = num*10 + st.charAt(j)-48;
                }
                v = v/2;
                j++;
            }
            if(num > k && num <big){
                big = num;
            }
        }
        return big;
    }
}
