package RaghuSir.javaPrograms.Collections.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> mp = new HashMap<>();
        mp.put(101,"Deepith");
        mp.put(102,"Deekshith");
        mp.put(103,"Gags");
        mp.put(104,"Jeevu");
        mp.put(null,"Deepith");

//        System.out.println(mp.size()); //4
//        System.out.println(mp);
//        System.out.println(mp.get(101)); //Deepith
//        System.out.println(mp.get(121));// null
//
//        System.out.println(mp.containsKey(101)); //true
//        System.out.println(mp.containsKey(131)); //false
//
//        System.out.println(mp.containsValue("Deekshith"));
//
//        System.out.println(mp.remove(null));
//        System.out.println(mp);
//        System.out.println(mp.remove(null));



//        // To get the keys
//
//        Set<Integer> keys = mp.keySet();
//
//        for(Integer key:keys){
//            System.out.println(key+" = "+mp.get(key));
//        }
//
//        // TO get the values
//
//        Collection<String> value = mp.values();
//        System.out.println(value);


        Set<Map.Entry<Integer,String >> entries = mp.entrySet();
        for(Map.Entry<Integer,String > entry: entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
