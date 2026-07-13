package RaghuSir.javaPrograms.Collections.Maps.TreeMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        LinkedHashMap<String, List<Integer>>  map = new  LinkedHashMap<>();

        for(Integer ele:arr){

          String key;

          if(ele%2==0){
              key = "Even";
          }else{
              key = "Odd";
          }

          //If the key dosent exist create new list
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(ele);

        }

        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
