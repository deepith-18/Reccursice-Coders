package RaghuSir.javaPrograms.SortingTechniques;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int [] arr = {23,43,12,65,76,87,65};
       heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void heapSort(int [] arr){
        int n =  arr.length;

        for(int i=n/2-1;i>=0;i--){
            heapify(arr,i,n);
        }
        for(int i=n-1;i>0;i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr,0,i);
        }


    }

    static void heapify(int [] arr,int i,int n){
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if(l<n && arr[l]>arr[largest]){
            largest = l;
        }
        if(r<n && arr[r]>arr[largest]){
            largest = r;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr,largest,n);
        }
    }
}
