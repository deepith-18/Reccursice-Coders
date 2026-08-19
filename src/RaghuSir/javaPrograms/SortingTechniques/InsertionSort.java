package RaghuSir.javaPrograms.SortingTechniques;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int [] nums = {3,2,1,4,5};
        insertionSort(nums);

    }



    //    Time Complexity:
//
//    Best:O(n)
//    Averager:O(n^2);
//    Worst:O(n^2)
//
//    Space:O(1)
//
//    Stability:Yes


    static void insertionSort(int []arr){
        for(int i=1;i<arr.length;i++){
            int ele=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>ele){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=ele;
        }
        System.out.println(Arrays.toString(arr));
    }
}
