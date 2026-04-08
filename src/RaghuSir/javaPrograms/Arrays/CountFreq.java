package RaghuSir.javaPrograms.Arrays;

public class CountFreq {
    public static void main(String[] args) {
        count(2343);
    }
    static void count(int n){
        int []count = new int[10];
        do{
            count[n%10]++;
            n =n/10;
        }while(n!=0);
        for(int i=0;i<count.length;i++){
            if(count[i]!=0)
                System.out.println(i+"->"+count[i]);
        }
    }
}
