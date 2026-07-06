package RaghuSir.javaPrograms.Collections.Sets.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class IntDoub {
    public static void main(String[] args) {

        TreeSet<Object> treeSet = new TreeSet<>((o1,o2)-> {
            double d1 = ((Number)o1).doubleValue();
            double d2 = ((Number)o2).doubleValue();

            if(d1==d2){
                return 1;
            }
            return Double.compare(d1,d2);
        });

        treeSet.add(10);
        treeSet.add(10.0);
        treeSet.add(20);
        treeSet.add(20.5);
        treeSet.add(20.0);
        treeSet.add(20.5);
        System.out.println(treeSet);
    }
}
