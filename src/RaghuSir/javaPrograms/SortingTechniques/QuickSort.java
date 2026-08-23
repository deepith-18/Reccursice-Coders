package RaghuSir.javaPrograms.SortingTechniques;

public class QuickSort {

    static int partition(int[] x, int low, int high) {

        int pivot = x[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (x[j] < pivot) {

                i++;

                int temp = x[j];
                x[j] = x[i];
                x[i] = temp;
            }
        }

        // Put pivot in its correct position
        int temp = x[i + 1];
        x[i + 1] = x[high];
        x[high] = temp;

        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5};

        quickSort(arr);

        System.out.println(java.util.Arrays.toString(arr));
    }
}