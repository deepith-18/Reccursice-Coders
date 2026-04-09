package OOPS.RohanSir.Products;

public class Pen extends Product{
    String inkColor;
    String material;

    Pen(String brand,double price,String inkColor,String material){
        super(brand,price);
        this.inkColor=inkColor;
        this.material=material;
    }
}
