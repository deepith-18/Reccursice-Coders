package OOPS.RohanSir.NonPrimitiveTypeasting;

public class ElectricBike extends Bike{

    String batteryType;

    ElectricBike(String brand,double price,String bikeNo,String batteryType){
        super(brand, price, bikeNo);
        this.batteryType=batteryType;
    }

    public void chargeBattery(){
        System.out.println("Electric bike battery  is Charging");
    }

    public String getBatteryType(){
        return batteryType;
    }
}
