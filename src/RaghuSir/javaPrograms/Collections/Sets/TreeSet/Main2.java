package RaghuSir.javaPrograms.Collections.Sets.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {

        Comparator<String> dsc = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        };
//        Comparator<String> dsc = (o1,o2)-> -o1.compareTo(o2);


        TreeSet<String> names = new TreeSet<>((o1,o2)->o1.compareTo(o2)>0?1:1); //TreeSet can possible to add duplicates
        names.add("Ramesh");
        names.add("Ramesh");
        names.add("Suresh");
        names.add("Sarvesh");
        names.add("Mukesh");
        names.add("Rajesh");
        names.add("Jaggesh");
        names.add("Ganesh");

        System.out.println(names);

    }
}
