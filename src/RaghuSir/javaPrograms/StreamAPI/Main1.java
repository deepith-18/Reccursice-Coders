package RaghuSir.javaPrograms.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {


        //Printing it clean like the Array of elements in the form of Single String
        List<String> names = Arrays.asList("Deepith","Deekshith","Jeevan","Gaga");
        String mstr = names.stream().collect(Collectors.joining(" "));

        mstr = names.stream().collect(Collectors.joining(",","[","]"));

        System.out.println(mstr);
    }
}
