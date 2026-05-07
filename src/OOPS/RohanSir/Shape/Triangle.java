package OOPS.RohanSir.Shape;

public class Triangle implements Shape{
    double base;
    double height;

    Triangle(double base,double height){
        this.base=base;
    }
    @Override
    public double calculateArea() {
        return 0.5*base*height;
    }
}
