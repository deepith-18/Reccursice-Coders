package RaghuSir.javaPrograms.Arrays;

public class Nthbiggest {
    public static void main(String[] args) {
    int [] arr = {21,25,87,78,54};
    int ans = nthBiggest(arr,2);
        System.out.println(ans);
    }
    static int nthBiggest(int []arr,int n){

        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    count++;
                }
            }
            if(count == n-1){
                return arr[i];
            }
        }
        return 0;
    }
}
