package RaghuSir.javaPrograms.Reccursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int []arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArr(int[]arr){
        reverseArr(arr,0,arr.length-1);
    }
    static void reverseArr(int [] x,int start,int end){
        if(start >= end)
            return;

        int temp = x[start];
        x[start]=x[end];
        x[end]=temp;

        reverseArr(x,start+1,end-1);
    }
}
