package RaghuSir.javaPrograms.Collections.Maps.TreeMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {

        String [] names= {"gagana","deepith","deekshith","jeevu","sheela","deepika","madan"};

        TreeMap<Character, List<String>> map= new TreeMap<>();

        for(String name:names){

            if(!map.containsKey(name.charAt(0))){
                map.put(name.charAt(0),new ArrayList<>());
            }
            map.get(name.charAt(0)).add(name);
        }

        for(Map.Entry<Character,List<String>> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
