public class Practice {
    public static void main(String[] args) {
    int ans = decToBin(9);
    System.out.println(ans);
    }
    static int decToBin(int n){
        int bin = 0;
        int place = 1;
        while(n>0) {
            int rem = n % 2;
            bin = bin + rem * place;
            place *= 10;
            n = n /2;
        }
        return bin;
    }

    static int binToDec(int n){
        int dec = 0;
        int place = 1;

        do{
            int rem = n % 10;
            dec = dec + rem *place;
            place= place*2;
            n /= 10;
        }while(n!=0);
        return dec;
    }

    static int hextoDec(String hx){

        String st = "0123456789ABCDEF";
        hx = hx.toUpperCase();
        int dec=0,p=1;

        for(int i=hx.length()-1;i>=0;i--){
            char ch = hx.charAt(i);
            dec = dec+ st.indexOf(ch)*p;
            p*=16;
        }
        return dec;
    }
}
