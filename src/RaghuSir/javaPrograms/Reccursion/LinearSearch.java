package RaghuSir.javaPrograms.Reccursion;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int target = 5;
        int ans = linearSearch(arr,target);
        if(ans == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at"+ans);
        }
    }
    static int linearSearch(int []arr,int target){
        return linearSearch(arr, target, 0);
    }

    static int linearSearch(int []x,int tar,int index){
        if(index == x.length){
            return -1;
        }
        if(x[index]==tar){
            return index;
        }
        return linearSearch(x,tar,index+1);
    }
}
