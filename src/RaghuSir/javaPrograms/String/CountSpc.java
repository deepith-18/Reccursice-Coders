package RaghuSir.javaPrograms.String;

public class CountSpc {
    public static void main(String[] args) {
String name = "1001";
//int ans = spcCount(name);
//        int ans = sumOfDigits(name);
        boolean ans = isPalindrome(name);
        System.out.println(ans);

    }
    static int spcCount(String st){
        int spc=0;

        for(char ch: st.toCharArray()){
            if(!(ch>=65 && ch<=90 || ch>=97 && ch<=122 || ch >=48 && ch<=57)){
                spc++;
            }
        }
        return spc;
    }

    static int sumOfDigits(String st){
        int sum=0;
        for(char ch:st.toCharArray()){
            if(ch>=48 && ch <= 57){
                sum += ch-'0';
            }
        }
        return sum;
    }

    static boolean isPalindrome(String st){
        int start = 0;
        int end = st.length() - 1;

        while(start < end){
            if(st.charAt(start) != st.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
