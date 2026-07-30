package RaghuSir.javaPrograms.StreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main5 {

    public static void main(String[] args) {

        String sentence = "Rama and Laxmana both are brothers. Rama married to sita and";


        // Calculate the word length in the sentence
        Map<String,Long> freq = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(a -> a,Collectors.counting()));
        System.out.println(freq);

        freq.forEach((k,v)->{
            System.out.println(k+":"+v);
        });


    }
}
