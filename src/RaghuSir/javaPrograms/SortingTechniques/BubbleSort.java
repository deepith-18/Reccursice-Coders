package RaghuSir.javaPrograms.SortingTechniques;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int [] nums = {2,3,4,1,5};

        buubleSort(nums);
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


    static void buubleSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            boolean isSorted=true;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    isSorted=false;
                }
            }
            if(isSorted){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

