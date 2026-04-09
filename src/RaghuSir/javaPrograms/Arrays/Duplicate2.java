package RaghuSir.javaPrograms.Arrays;

public class Duplicate2 {
    public static void main(String[] args) {
        int[] arr = {23,45,67,78,36,45,89,45};

        int big = arr[0];

        for(int elem : arr){
            if(elem>big){
                big=elem;
            }
        }
        int[]count = new int[big+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=0;i< count.length;i++){
            if(count[i]!=0)
                System.out.println(i+"->"+count[i]);
        }
    }
}
