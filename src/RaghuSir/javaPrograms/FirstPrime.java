package RaghuSir.javaPrograms;

public class FirstPrime {
    public static void main(String[] args) {
            int ans = numberOfPrimewithN(10);
            System.out.println(ans);
    }
    static int getNthPrime(int n){
        for(int i=2;n>0;i++){
            if(isPrime(i)){
                n--;
                if(n==0){
                    return i;
                }
            }
        }
        return 0;
    }
    static boolean isPrime(int n){
        if(n<=1) return false;

        if(n<=3) return true;

        if(n%2 == 0 || n%3==0){
            return false;
        }

        for(int i=5;i*i<=n;i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    static int numberOfPrimewithN(int n){
        int count = 0;
        for(int i=2;i<=n
                ;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    static void fibonacci(int n){
        int f1=0,f2=1,f3;
        while(f1<=n){
            System.out.println(f1);
        }
    }
}
