package OOPS.RohanSir.Products;

public class Mobile extends Product {

    int ram;
    String os;

    Mobile(String brand,double price ,int ram,String os){
        super(brand,price);
        this.ram=ram;
        this.os=os;
    }

}
