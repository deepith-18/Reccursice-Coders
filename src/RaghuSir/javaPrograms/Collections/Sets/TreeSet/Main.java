package RaghuSir.javaPrograms.Collections.Sets.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(4);
        ts.add(1);
        ts.add(2);
        ts.add(2);

        Iterator itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
