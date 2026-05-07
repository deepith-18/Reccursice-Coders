package OOPS.RohanSir.Shape;

public class Circle extends Elipse{
    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    public double calculateArea(){
        return 3.14*radius*radius;
    }
}
