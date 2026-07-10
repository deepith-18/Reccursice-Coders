package RaghuSir.javaPrograms.Collections.Maps;

import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {

        HashMap<Integer,String> mp = new HashMap<>(5,080f);
        mp.put(1,"a");
        mp.put(2,"b");
        mp.put(3,"c");
        mp.put(4,"d");
        mp.put(5,"e");

        System.out.println(mp.size());
        System.out.println(mp);
    }
}
