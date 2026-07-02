package Digit.Arrays;
import java.util.*;
public class Array {
    public static void main(String[] args) {
//        int [] arr ={1,5,3,4};
//        int ans = missing(arr);
//        System.out.println(ans);

//         duplicate(new int []{1,2,3,2,4,3,5,5});


//           moveZeros(new int[]{0,1,0,3,12});
//        int [] arr = {1,2,2,3,3,4};
//        int[] ans = removeDup(arr);
//        System.out.println(Arrays.toString(ans));
//        intersection(new int[]{1,2,3,4},new int[]{3,4,5,6});

//        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        System.out.println(maxSubArray(arr)); // 6

        leaders(new int[]{16, 17, 4, 3, 5, 2});
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

    static void intersection(int [] a,int[] b){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.print("["+a[i]+"]"+" ");
                }
            }
        }
    }

    static int maxSubArray(int[]arr){
        int currentSum=arr[0];
        int maxSum=arr[0];

        for(int i=1;i<arr.length;i++){
            currentSum = Math.max(arr[i],currentSum+arr[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

    static int small(int[]arr){

        if(arr.length==0){
            throw new IllegalArgumentException("Array is empty");
        }
        int small = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        return small;
    }

    static int secondSmall(int [] arr){
        int small=Integer.MAX_VALUE;
        int secSmall=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secSmall=small;
                small=arr[i];
            }else if(arr[i]<secSmall && arr[i]>small)
                secSmall=arr[i];
        }
        return secSmall;
    }

    static boolean isSorted(int[] arr){
        boolean sorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sorted=false;
                break;
            }
        }
        return sorted;
    }

    static int[] union(int[]a,int[]b){
        HashSet<Integer> set = new HashSet<>();

        for(int x:a){
            set.add(x);
        }
        for(int y:b){
            set.add(y);
        }
        int[] res= new int[set.size()];
        int i=0;
        for(int x:set){
            res[i++]=x;
        }
        return res;
    }

    static int majority(int[]arr){
        int candidate = arr[0];
        int count=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                candidate = arr[i];
                count=1;
            }
        }
        return candidate;
    }


    static void leaders(int[]arr){
        int max=arr[arr.length-1];
        System.out.print(max+" ");

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                System.out.print(max+" ");
            }
        }
    }

    static int maxConsOne(int[]arr){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                max = Math.max(max,count);
            }else{
                count=0;
            }
        }
        return max;
    }

    static int stockBySell(int []arr){
        int minPrice=arr[0];
        int maxProfit=0;

        for(int i=0;i<arr.length;i++){
            minPrice = Math.min(minPrice,arr[i]);

            int profit = arr[i]-minPrice;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }

    static int[] productArray(int [] arr){
        int n = arr.length;
        int [] ans = new int[arr.length];
        int prodL=1;
        int prodR=1;

        for(int i=n-1;i>=0;i++){
            ans[i]=prodR;
            prodR=prodR*arr[i];
        }
        for(int i=0;i<n;i++){
            ans[i]=ans[i]*prodL;
            prodL=prodL*arr[i];
        }
        return ans;
    }

    static int longestCons(int []arr){
        HashSet<Integer> set = new HashSet<>();

        for(int num:arr){
            set.add(num);
        }

        int longest=0;

        for(int num :set){
            if(!set.contains(num-1)){
                int currentSum=num;
                int count=1;

                while(set.contains(currentSum+1)){
                    currentSum++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }

    static int[] twoSum2(int[]arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int compliment= target-arr[i];

            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

    


  static List<List<Integer>> threeSum(int []nums){

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for(int i=0;i<nums.length-2;i++){

            int left=i+1;
            int right=nums.length-1;

            while (left<right){
                int sum = nums[i]+nums[left]+nums[right];

                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }else if(sum <0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
  }


}
