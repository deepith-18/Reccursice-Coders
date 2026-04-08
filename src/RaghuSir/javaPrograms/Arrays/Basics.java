package RaghuSir.javaPrograms.Arrays;
import java.util.Scanner;
public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[]arr = new int[n];


        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }


        for(int x:arr){
            System.out.print(x+" ");
        }

        System.out.println();
        reverse(arr);
        System.out.println("Reversed Array: ");
        for(int y:arr){
            System.out.print(y+" ");
        }
        System.out.println();
        System.out.println("Sum of array is : "+sumOfArray(arr));

    }
    static void reverse(int []arr){
        int first=0;
        int last=arr.length-1;
        while(first<last){

            int temp = arr[first];
            arr[first++]=arr[last];
            arr[last--]=temp;

        }
    }

    static int sumOfArray(int[] arr){
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        return sum;

    }

    static int frequencyOfArray(int[] arr,int elem){
        int count=0;
        for(int x:arr){
            if(x==elem) {
                count++;
            }
        }
        return count;

    }

}
