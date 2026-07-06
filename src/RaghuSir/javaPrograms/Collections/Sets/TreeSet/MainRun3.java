package RaghuSir.javaPrograms.Collections.Sets.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class MainRun3 {
    public static void main(String[] args) {

        Comparator<Integer> comparator = (o1,o2)->o1.compareTo(o2)>0?1:-1;

        TreeSet<Integer> number = new TreeSet<>(comparator);
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(20);
        number.add(50);
        number.add(40);
        number.add(60);
        number.add(30);
        number.add(20);
        System.out.println(number);
    }
}
