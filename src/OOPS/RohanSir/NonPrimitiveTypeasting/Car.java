package OOPS.RohanSir.NonPrimitiveTypeasting;

public class Car extends Vehicle {
    String carNo;


    Car(String brand,double price,String carNo){
        super(brand, price);
        this.carNo=carNo;
    }

    public void drive(){
        System.out.println("Driving the Car");
    }

    public String getCarNo(){
        return carNo;
    }
}
