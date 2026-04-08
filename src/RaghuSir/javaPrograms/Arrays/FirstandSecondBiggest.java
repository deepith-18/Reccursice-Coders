package RaghuSir.javaPrograms.Arrays;

public class FirstandSecondBiggest {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};

        int fbig = arr[0];
        int sbig = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > fbig){
                sbig=fbig;
                fbig = arr[i];
            }else if(arr[i] > sbig && arr[i] != fbig){
                sbig = arr[i];
            }
        }
        System.out.println("First Big Number: "+fbig);
        System.out.println("Second Big Number: "+sbig);
    }
}
