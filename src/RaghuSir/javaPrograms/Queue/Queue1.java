package RaghuSir.javaPrograms.Queue;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Queue1 {

    public static void main(String[] args) {

        Comparator<Integer> comparator = (o1,o2)->o1.compareTo(o2)>0?-1:1;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//       PriorityQueue pq = new PriorityQueue();
        pq.add(50);
        pq.add(20);
        pq.add(30);
        pq.add(10);
        pq.add(40);
//       pq.add(null);
//        pq.add(new Pen("red",23.0));
//        pq.add(10);
//        pq.add(10.5);
        System.out.println(pq);
    }

    // In the Priority Queue the heterogenous can never be able to add

}
