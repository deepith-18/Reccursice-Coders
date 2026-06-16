package GoDigit.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] arr ={1,5,3,4};
        int ans = missing(arr);
        System.out.println(ans);

    }
    static int maxELe(int [] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    static int secondMax(int [] arr){
        int max=Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            }else if(arr[i]>second && arr[i]<max){
                second=arr[i];
            }
        }
        return second;
    }

    static void reverse(int[] arr){
        int i=0;
        int j= arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

    static int missing(int []nums){
        int n=nums.length+1;
        int expected = (n*(n+1)/2);
        int actutal = 0;
        for(int val:nums){
            actutal+=val;
        }
        return expected-actutal;
    }

    static void duplicate(int[]nums){

    }
}
