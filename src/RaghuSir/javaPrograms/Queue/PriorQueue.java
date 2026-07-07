package RaghuSir.javaPrograms.Queue;
import java.util.PriorityQueue;
public class PriorQueue {



    public static void main(String[] args) {

        PriorityQueue<Pen> pq = new PriorityQueue<>();
        pq.add(new Pen("Red",50.0));
        pq.add(new Pen("Yellow",30.0));
        pq.add(new Pen("Green",60.0));

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        pq.offer(new Pen("Gold",100.0));
        System.out.println(pq);


    }
}
