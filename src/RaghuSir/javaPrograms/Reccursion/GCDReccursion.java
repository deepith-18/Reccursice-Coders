package RaghuSir.javaPrograms.Reccursion;

public class GCDReccursion {
    public static void main(String[] args) {
        int a=18;
        int b=24;
        int GCD= gcdRecc(a,b);
        System.out.println(GCD);
    }
    static int gcd(int m,int n){
        int gcd=1;
        for(int i=2;i<m&&i<n;i++){
            if(m%i==0 && n%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    static int gcd2(int m,int n){
        while(n!=0){
            int temp=n;
            n=m%n;
            m=temp;
        }
        return m;
    }
    static int gcdRecc(int m,int n){
        if(n==0){
            return m;
        }
        return gcdRecc(n,m%n);
    }
}
