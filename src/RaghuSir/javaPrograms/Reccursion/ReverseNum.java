package RaghuSir.javaPrograms.Reccursion;

public class ReverseNum {
    public static void main(String[] args) {
        int num= 378;
        int rev = reverse(num);
        System.out.println(rev);
    }
    static int reverse(int num){
        return reverse(num,0);
    }
    static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        return reverse(n/10,rev*10+(n%10));
    }
}
