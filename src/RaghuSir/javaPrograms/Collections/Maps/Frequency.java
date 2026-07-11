package RaghuSir.javaPrograms.Collections.Maps;

import java.util.LinkedHashMap;

public class Frequency {

    public static void main(String[] args) {

        String str = "Hello World";

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
//            if(map.containsKey(ch)){
//                map.put(ch,map.get(ch)+1);
//            }else{
//                map.put(ch,1);
//            }

            map.put(ch,map.getOrDefault(ch,0)+1);
        }

//        System.out.println(map.toString());

        for(Character ch:map.keySet()){
            System.out.println(ch+" : "+map.get(ch));
        }
    }
}
