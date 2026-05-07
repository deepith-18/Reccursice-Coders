package OOPS.RohanSir.Shape;

public class Elipse implements Shape{
    double a;
    double b;

    @Override
    public double calculateArea(){
        return 3.14*a*b;
    }
}
