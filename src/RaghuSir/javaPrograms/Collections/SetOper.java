package RaghuSir.javaPrograms.Collections;

import java.util.HashSet;

public class SetOper {
    public static void main(String[] args) {

        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);



        HashSet<Integer> s2 = new HashSet<>();
        s2.add(4);
        s2.add(5);
        s2.add(6);
        s2.add(7);
        s2.add(8);

        HashSet<Integer> union = new HashSet<>();
        union.addAll(s1);
        union.addAll(s2);
        System.out.println(union);

        HashSet<Integer> intersection = new HashSet<>();
        intersection.addAll(s1);
        intersection.retainAll(s2);
        System.out.println(intersection);


        HashSet<Integer> diff = new HashSet<>(s1);
        diff.removeAll(s1);
        System.out.println(diff);

        HashSet<Integer> semDiff =new HashSet<>();
        semDiff.addAll(s1);
        semDiff.addAll(s2);
        semDiff.removeAll(intersection);
        System.out.println(semDiff);
    }
}
