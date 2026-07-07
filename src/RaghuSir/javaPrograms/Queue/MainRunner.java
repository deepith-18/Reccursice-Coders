package RaghuSir.javaPrograms.Queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MainRunner {

    public static void main(String[] args) {


        Comparator<Book> priceComp = (o1,o2)-> Double.compare(o1.getPrice(),o2.getPrice());
        PriorityQueue<Book> pq = new PriorityQueue<>(priceComp);
        pq.add(new Book(101,"Java",400.0));
        pq.add(new Book(102,"C",500.0));
        pq.add(new Book(103,"Python",600.0));
        pq.add(new Book(104,"GO",700.0));
        pq.add(new Book(105,"Js",100.0));

        Iterator<Book> itr = pq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
