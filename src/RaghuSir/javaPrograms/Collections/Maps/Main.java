package RaghuSir.javaPrograms.Collections.Maps;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,String> mp = new HashMap<>();
        mp.put(101,"Deepith");
        mp.put(102,"Deekshith");
        mp.put(103,"Gags");
        mp.put(104,"Jeevu");
        mp.put(null,"Deepith");

        System.out.println(mp.size()); //4
        System.out.println(mp);
        System.out.println(mp.get(101)); //Deepith
        System.out.println(mp.get(121));// null

        System.out.println(mp.containsKey(101)); //true
        System.out.println(mp.containsKey(131)); //false

        System.out.println(mp.containsValue("Deekshith"));

        System.out.println(mp.remove(null));
        System.out.println(mp);
        System.out.println(mp.remove(null));


    }
}
