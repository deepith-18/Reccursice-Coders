public class Prac {

    public static void main(String[] args) {

//        int a=5;
//        int ans=factorial(a);
//        System.out.println(ans);

//        fibonacci(10);

        int a=12;
        boolean ans = isPerfect(a);
        System.out.println(ans);

        noteInWords(23,"Lakh");

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


        static boolean isEvenOrOdd(int n){
        return n%2==0;
        }

        static void swap(int a,int b){
           int temp =a;
            a=b;
            b=temp;
        }

        static void swap1(int a,int b){

        a=a+b;
        b=a-b;
        a=a-b;

        }


        static void swap2(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        }

        static int largest(int a, int b ,int c){
        int big=a;

        if(b>big){
            big=b;
        }else if(c>big){
            big=c;
        }
        return big;
        }

        static boolean isPerfect(int n){

        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return n==sum;
        }

        static boolean isPerfect2(int n){
        if(n<=1){
            return false;
        }

        int sum=1;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                sum+=i;

                if(i*i != n){
                    sum+= n/i;
                }
            }
        }
        return n==sum;
        }


        static boolean isStrong(int n){
        int original=n;
        int sum=0;

        while(n>0){
            int rem= n%10;
            sum += factorial(n);
            n/=10;
        }
        return original==sum;
        }



        static boolean isAutomorphic(int n){
            long square = (long) n*n;
            int temp=n;

            while(temp>0){
                if(temp%10 != square%10){
                    return false;
                }
                temp/=10;
                square/=10;
            }
            return true;
        }


        static int decToBin(int n){
            int bin=0;
            int place=1;

            while(n>0){
                int rem=n%2;
                bin = bin +rem*place;
                place*=10;
                n/=2;
            }
            return bin;
        }

        static int binToDec(int n){
        int dec=0;
        int place=1;

        while(n>0){
            int rem=n%10;
            dec = dec +rem*place;
            place*=2;
            n/=10;
        }
        return dec;
        }

        static int hextoDec(String hx){
            String st ="0123456789ABCDEF";
            hx = hx.toUpperCase();
            int dec=0;
            int p=1;

            for(int i=hx.length()-1;i>=0;i--){
                char ch = hx.charAt(i);
                dec = dec+st.indexOf(ch)*p;
                p*=16;
            }
            return dec;
        }


        static boolean powerOfTwo(int n){
        if(n<=0){
            return false;
        }
        while(n%2==0){
            n/=2;
        }
        return n==1;
        }


        static int singleNum(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res^=arr[i];
        }
        return res;
        }


        static int countBit1(int n){
        int count=0;

        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
        }

        static int countBit2(int n){
        int count=0;
        while(n>0){
            n = n & (n-1);
            count++;
        }
        return count;
        }

    static int trailingZeros(int n) {
        int count = 0;

        while (n >= 5) {
            n /= 5;
            count += n;
        }

        return count;
    }




static String isXP(int n){
        int es=0,ms=0;
        es+=n%10;
        n=n/10;
        while(n>9){
            ms+=n%10;
        }
        es+=n;
        return es==ms ? "Xylem":"Phloem";
}


static void noteInWords(int n,String str){

        if(n==0){
            return;
        }

        String []x = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen",
        "Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

        String [] y = {" "," ","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};

        if(n<20){
            System.out.println(x[n]);
        }else{
            System.out.println(y[n/10]+" "+x[n%10]);
            System.out.print(str+" ");
        }
}


}
