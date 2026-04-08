package OOPS.RohanSir.ParameterizedConstructor;

public class Bike {
    String brand;
    double price;
    int model;
    int cc;

    Bike(String brand,double price,int model,int cc){
        this.brand=brand;
        this.price=price;
        this.model=model;
        this.cc=cc;
    }
    public void displayBikie(){
        System.out.println("Brand: "+this.brand);
        System.out.println("Price: "+this.price);
        System.out.println("Model: "+this.model);
        System.out.println("Engine CC: "+ this.cc);
    }
}
