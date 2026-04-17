package OOPS.RohanSir.NonPrimitiveTypeasting;

public class Vehicle {

    String brand;
    double price;


    Vehicle(String brand,double price){
        this.brand=brand;
        this.price=price;
    }

    public void start(){
        System.out.println("Vehicle Started");
    }

    public void stop(){
        System.out.println("Vehicle Stopped");
    }

    public String getBrand(){
        return brand;
    }

    public double getPrice(){
        return price;
    }
}
