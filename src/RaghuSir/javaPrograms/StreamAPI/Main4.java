package RaghuSir.javaPrograms.StreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main4 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,1,2,3,4,5,6,7,8,9,10);

        //Calculate the Frequency

//        Map<Integer,Long> freq = numbers.stream().
//                                         collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//
//        freq.forEach((k,v)->System.out.println(k+" = "+v));
//
//        Map<Integer,List<Integer>> eo = numbers.stream()
//                .collect(Collectors.groupingBy(n -> n%2));
//
//        eo.forEach((k,v)->System.out.println(k+" = "+v));


        Map<String,List<Integer>> eo1 = numbers.stream()
                .collect(Collectors.groupingBy(n -> n%2==0 ?"Even":"Odd"));

        eo1.forEach((k,v)->System.out.println(k+" = "+v));

        Map<String, Long> eogroup = numbers.stream()
                .collect(Collectors.groupingBy(n -> n%2==0 ?"Even":"Odd",Collectors.counting()));

        eogroup.forEach((k,v)->System.out.println(k+" = "+v));
    }
}
