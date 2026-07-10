public class Prac {

    public static void main(String[] args) {

//        int a=5;
//        int ans=factorial(a);
//        System.out.println(ans);

        fibonacci(10);

    }
    static int factorial ( int n){
        int fact = 1;
        while (n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
    static int factRecc(int n){
        return n *factRecc(n-1);
    }

    static void fibbocaci(int n){
    fibonacci(10);
    }
    static void fibonacci(int n){
        int a=0;
        int b =1;

        for(int i=0;i<n;i++){
            System.out.println(a+" ");

            int c=a+b; //
            a=b;
            b=c;
        }
    }

    static int reverse(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        return rev;
    }

    static boolean isPalindrome(int n){
        int original=n;
        int rev=0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n/=10;
        }
        return original==rev;
    }

    static boolean isAmstrong(int n){
        int origin=0;
        int ans=0;
        while(n>0){
            int rem = n%10;
            ans = rem*rem*rem;
            n=n/10;
        }
        return origin==ans;
    }

    static boolean isAms2(int n){
        int origin=n;
        int temp=n;
        int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int sum=0;
        temp=n;
        while(temp>0){
            int rem = temp%10;
            sum +=Math.pow(rem,count);
            temp/=10;
        }
        return sum==origin;
    }

    static boolean isDiseruum(int n){
        int origin=n;
        int temp=n;
        int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int sum=0;
        temp=n;
        while(temp>0){
            int rem=temp%10;
            sum += Math.pow(rem,count--);
            temp/=10;
        }
        return sum==origin;
    }

    static int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    static int count(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }

    static int gcd(int x,int y){
        int gcd=1;
        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0&&y%i==0){
                gcd=i;
            }
        }
        return gcd;
    }



        static int gcd1(int x, int y) {
            while (y != 0) {
                int t = y;
                y = x % y;
                x = t;
            }
            return x;
        }
}
