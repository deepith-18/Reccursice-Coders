package RaghuSir.javaPrograms.Collections.Maps.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class MainRunner {

    public static void main(String[] args) {

        String [] fruits = {"apple","banana","mango","grapes","pineapple","orange","kiwi","banana","jackfruit"};

        Comparator<String> comp = (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }else{
                return a.compareTo(b);
            }

        };


        TreeMap<String,Integer> map = new TreeMap(comp);

        for(String fruit:fruits){
            map.put(fruit,fruit.length());
        }

        for(String fruit:map.keySet()){
            System.out.println(fruit+": "+map.get(fruit));
        }
    }
}
