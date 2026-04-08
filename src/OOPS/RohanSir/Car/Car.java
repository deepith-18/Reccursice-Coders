package OOPS.RohanSir.Car;

public class Car {
    String brand;
    String color;
    Engine eng;

    Car(String brand,String color,Engine eng){
        this.brand=brand;
        this.color=color;
        this.eng=eng;
    }

    public void displayCarDetails(){
        System.out.println("Car brand: "+this.brand);
        System.out.println("Car color: "+this.color);
        eng.displayEngineDetails();
    }
}
