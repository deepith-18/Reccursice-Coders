package RaghuSir.javaPrograms.Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthBiggest {

    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,25};
        int big = kthLargest(arr,4);
        System.out.println(big);

        int small = kthSmallest(arr,3);
        System.out.println(small);
    }

    private static int kthLargest(int[]arr ,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int val:arr){
            pq.add(val);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }

    private static int kthSmallest(int []arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int val:arr){
            pq.add(val);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
