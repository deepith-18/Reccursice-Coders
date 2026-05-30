package OOPS.RohanSir.EqualsMethod;

public class Laptop {
    String brand;
    double price;


    @Override
    public boolean equals(Object o){
        if( o instanceof Laptop){
            Laptop l = (Laptop) o;
            return this.price==l.price && this.brand.equals(l.brand);
        }
        return false;
    }
}
