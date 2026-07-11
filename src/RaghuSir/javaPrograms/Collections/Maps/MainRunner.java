package RaghuSir.javaPrograms.Collections.Maps;

import java.util.HashMap;

public class MainRunner {
    public static void main(String[] args) {

        HashMap<Product,Double> map = new  HashMap<Product,Double>();
       map.put(new Product(1,"pen",12),232.0);
       map.put(new Product(2,"pencil",10),221.0);
       map.put(new Product(3,"eraser",16),200.0);
       map.put(new Product(4,"sharpener",11),132.0);
       map.put(new Product(3,"scale",19),242.0);

       for(Product p:map.keySet()) {
           System.out.println(p+" : "+map.get(p));
       }

    }
}
