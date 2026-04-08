import java.sql.SQLOutput;

public class StrongNum {
    public static void main(String[] args) {
        boolean ans = strongNum(15);
        if(ans) System.out.println("Strong NUmber");
        else System.out.println("Not a Strong Number");
    }
    static boolean strongNum(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int d = n % 10;
            sum += fact(d);
            n = n/10;
        }
        return (sum == original);
    }
    static int fact(int n){
        int f = 1;
        while(n>1){
            f = f*n;
            n--;
        }
        return f;
    }

    static boolean isAutoMorphic(int n){
        int square = n * n;

        while (n>0){
            if((n%10) != (square %10)){
            }
            n /=10;
            square /=10;
        }
        return true;
    }


    static boolean isHappy(int n){

        while(n!=1 && n != 4){
            int sum = 0;

            while (n > 0){
                int d = n % 10;
                sum += d * d;
                n /=10;
            }
            n = sum;
        }
        return (n==1);
    }

    static boolean isHarshad(int n){
        int original = n;

        int sum = 0;
        while (n>0){
            int d = n % 10;
            sum +=d;
            n /=10;
        }
        return ((original%sum)==0);
    }
    static boolean isXylem(int n){
        if(n < 10){
            return true;
        }
        int last = n%10;
        n /=10;

        int middleSum = 0;
        while(n >= 10){
            middleSum += n % 10;
            n /= 10;
        }
        int first = n;

        return ((first +last) == middleSum);
    }
}
