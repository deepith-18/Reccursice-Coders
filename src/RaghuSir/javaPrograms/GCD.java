package RaghuSir.javaPrograms;

public class GCD {
    public static void main(String[] args) {
        int ans = gcd(18,12);
        int ans1 = lcm(12,18);
        System.out.println(ans1);
        System.out.println(ans);
    }
    static int gcd(int x,int y){
        int gcd = 1;

        for(int i=1;i<=x && i<=y;i++){
            if(x%i==0&&y%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    static int gcd1(int x ,int y){
        while(true){
            if(x%y==0){
                return y;
            }
            int t = y;
            y=x%y;
            x=t;
        }
    }
    static int lcm(int x,int y){
        int bigNum = Math.max(x,y);
        for(int i =1;;i++){
            int prod = bigNum*i;
            if(prod % x == 0 && (prod & y) ==0){
                return prod;
            }
        }
    }
    static int lcmMethod(int x,int y){
        int lcm = (x*y)/gcd1(x,y);
        return lcm;
    }
}
