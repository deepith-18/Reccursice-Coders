package OOPS.RohanSir.ParameterizedConstructor;

public class Mobile {
    String brand;
    double price;
    String color;

    Mobile(String brand,double price,String color){
        this.brand=brand;
        this.price=price;
        this.color=color;
    }
   public void displayMobDet(){
       System.out.println("Mobile brand: "+this.brand);
       System.out.println("Mobile Price: "+ this.price);
       System.out.println("Mobile color: "+this.color);
    }
}
