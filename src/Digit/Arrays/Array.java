package Digit.Arrays;
import java.util.*;
public class Array {
    public static void main(String[] args) {
//        int [] arr ={1,5,3,4};
//        int ans = missing(arr);
//        System.out.println(ans);

//         duplicate(new int []{1,2,3,2,4,3,5,5});


           moveZeros(new int[]{0,1,0,3,12});
//        int [] arr = {1,2,2,3,3,4};
//        int[] ans = removeDup(arr);
//        System.out.println(Arrays.toString(ans));
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
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>0){
                System.out.println(nums[i]);
            }
        }
    }

    static int[] removeDup(int[]arr){
     Set<Integer> set = new HashSet<>();

     for(int num:arr){
         set.add(num);
     }
     int []result = new int[set.size()];
     int i=0;
     for(int num:set){
         result[i]=num;
         i++;
     }
     return result;
    }


    static void moveZeros(int [] arr){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void rotateLeft(int [] arr,int k){
        int n = arr.length;
        k=k%n;
        reverseArr(arr,0,k-1);
        reverseArr(arr,k,n-1);
        reverseArr(arr,0,n-1);
    }
    static void reverseArr(int []arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void twoSum(int[]arr,int targer){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==targer){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }

    static int[] mergeTwoArr(int[]a,int[]b){
        int[] c = new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        return c;
    }


}
