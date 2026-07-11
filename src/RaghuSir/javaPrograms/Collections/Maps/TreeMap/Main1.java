
package RaghuSir.javaPrograms.Collections.Maps.TreeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Main1 {
    public static void main(String[] args) {

        String[] fruits = {
                "apple", "banana", "mango", "grapes",
                "pineapple", "orange", "kiwi",
                "banana", "jackfruit"
        };

        TreeMap<Integer, List<String>> map = new TreeMap<>();

        for (String fruit : fruits) {

            if (!map.containsKey(fruit.length())) {
                map.put(fruit.length(), new ArrayList<>());
            }

            map.get(fruit.length()).add(fruit);
        }

        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}