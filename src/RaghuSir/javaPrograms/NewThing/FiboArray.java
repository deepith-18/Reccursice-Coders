package RaghuSir.javaPrograms.NewThing;

public class FiboArray {
    public static void main(String[] args) {

        int total = 7;

        int[] arr = new int[total];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println("The fibo array is:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
