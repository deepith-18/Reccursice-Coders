package RaghuSir.javaPrograms.SortingTechniques;

import java.util.Arrays;

public class MergeSort {

    static void merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        // Compare both halves
        while (i <= mid && j <= right) {

            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Remaining elements of left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Remaining elements of right half
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (int k1 = 0; k1 < temp.length; k1++) {
            arr[left + k1] = temp[k1];
        }
    }

    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);

            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void mergeSorrt(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 1, 5};

        mergeSorrt(arr);

        System.out.println(Arrays.toString(arr));
    }
}