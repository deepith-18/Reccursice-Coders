package RaghuSir.javaPrograms.Reccursion;

public class LCMReccursion {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        int LCM = lcmRecc(a,b);
        System.out.println(LCM);

    }
    static int lcm(int m,int n){
        for(int i=1;;i++){
            if((i*m)%n==0){
                return i*m;
            }
            return 0;
        }

    }

    static int lcmRecc(int m,int n){
        return lcmRecc(m,n,m);
    }
    private static int lcmRecc(int m,int n,int prod){
        if(prod%n==0){
            return prod;
        }
        return lcmRecc(m,n,prod+m);
    }

}
