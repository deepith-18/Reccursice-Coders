package RaghuSir.javaPrograms.Collections;
import java.util.*;
import java.util.ArrayList;

public class Mobile {
    String brand;
    String color;
    double price;

    public Mobile(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Mobile> a1 = new ArrayList<>();
        a1.add(new Mobile("vIVO","RED",242342));
        a1.add(new Mobile("Sam","yellow",24123));
        a1.add(new Mobile("Sung","green",123242));


        
    }
}
