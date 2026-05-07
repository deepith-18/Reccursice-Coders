package RaghuSir.javaPrograms.Reccursion;

public class SumArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int sum = sumOfArray(arr);
        System.out.println("Sum Of Array"+sum);
    }
    static int sumOfArray(int []arr){
        return sumOfArray(arr,0);
    }
    static int sumOfArray(int[] x,int index){
        if(index ==x.length ){
            return 0;
        }
        return x[index]+sumOfArray(x,index+1);

    }
}
