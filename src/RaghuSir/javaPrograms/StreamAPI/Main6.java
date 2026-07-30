package RaghuSir.javaPrograms.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main6 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Deepith","Deekshith","Jeevan","Sheela","Nagraj","jon","Bob","Ramu","Rani");

        Map<Integer,List<String>> freq = names.stream()
                .collect(Collectors.groupingBy(String::length));

        freq.forEach((k,v)->{
            System.out.println(k+":"+v);
        });

        Map<Character,Long> freq1 = names.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0),Collectors.counting()));

        freq1.forEach((k,v)->{
            System.out.println(k+":"+v);
        });
    }
}
