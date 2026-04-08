package RaghuSir.javaPrograms.Arrays;

public class Frequency {
    public static void main(String [] args){
        int[] arr = {23,45,36,78,45,32,56,45,97};
        frequency(arr);

    }
    static void frequency(int [] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                int count=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        arr[j]=-1;
                    }
                }
                System.out.println(arr[i]+"->"+count);
            }
        }
    }
}
