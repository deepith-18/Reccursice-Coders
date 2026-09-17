package Logic;

public class ClimbingStairs {
    public static void main(String[] args) {
    int n=3;
    int ans = climbStairs(4);
    System.out.println(ans);
    }
    public static int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int a =1;
        int b = 2;

        for(int i=3;i<=n;i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }

    static int climb(int n){
        if(n<=3){
            return n;
        }
        return climb(n-1)+climb(n-2);
    }
}
