public class Power {
    public static void main(String [] args){
//        int ans = powOfNumber(0,0);
//        System.out.println(ans);

        boolean val = isPalindrome(1231);
        System.out.println(val);

    }
    static int powOfNumber(int base,int p){
        if(base == 0){
            return 0;
        }
        if(p == 0){
            return 1;
        }
        int num = base;
        for(int i =0;i<p;i++){
          base *= num;
        }
        return base;
    }

    static boolean isPalindrome(int n){
        int original = n;
        int ans = 0;
        while(n != 0){
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n/10;
        }
        return (ans == original);
    }
}
