package OOPS.RohanSir.NonPrimitiveTypeasting;

public class Bike extends Vehicle{

    String bikeNo;

    Bike(String brand,double price,String bikeNo){
        super(brand, price);
        this.bikeNo=bikeNo;
    }

    public void ride(){
        System.out.println("Riding the bike");
    }

    public String getBikeNo(){
        return bikeNo;
    }
}
