public class Test {
    public static void main(String [] args){
        int ans = powerOfNumber(3,3);
        System.out.println(ans);
    }
    static int powerOfNumber(int base,int pow){
        if(base == 0) return 0;
        if(pow ==0)  return 1;
        int power=1;
        while(pow >0){
            power = power*base;
            pow--;
        }
        return power;
    }
}
