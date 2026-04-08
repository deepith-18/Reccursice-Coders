import java.util.*;
public class Prime {
    public static void main(String[] args) {
    boolean ans = isPrime(30);
    System.out.println(ans);
    }
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        if(n%2 == 0 || n%3 == 0){
            return false;
        }
        for(int i=5;i*i <=n; i+=2){
            if(n%i==0 && n % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }

 static boolean isAms(int n){
        int original = n;
        int sum = 0;

        int temp = n;
        int digits = 0;
        while(temp != 0){
            digits++;
            temp = temp/10;
        }

        while (n!= 0){
            int d = n%10;
            sum += Math.pow(d,digits);
            n /= 10;

        }
        return (sum == original);
 }

 static boolean isDeserium(int n){
        int original = n;
        int temp = n;

      // Count Numbers

     int digits = 0;
     while(temp != 0){
         digits++;
         temp /= 10;
     }

     int sum=0;

     temp = n;

     while(temp!=0){
         int d = temp % 10;
       // Power
         int power = 1;
         for(int i=0 ;i<digits;i++){
             power *=d;
         }
         sum += power;
            digits--;
            temp /= 10;
     }
     return (sum == original);
 }

 static boolean isNeon(int n){
        int square = n*n;
        int original = n;
        int sum = 0;
        while(square != 0){
            int d = square % 10;
            sum +=d;
            square /= 10;
        }
        return (sum == original);
 }
}

