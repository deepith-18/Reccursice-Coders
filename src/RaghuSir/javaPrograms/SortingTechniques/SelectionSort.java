package RaghuSir.javaPrograms.SortingTechniques;

import org.w3c.dom.Node;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int [] nums = {3,2,1,4,5};
        selectionSort(nums);
    }

    //    Time Complexity:
//
//    Best:O(n^2)
//    Averager:O(n^2);
//    Worst:O(n^2)
//
//    Space:O(1)
//
//    Stability:No





    static void selectionSort(int []arr) {

        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
                if(i!=minindex){
                    int temp = arr[i];
                    arr[i]=arr[minindex];
                    arr[minindex]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
