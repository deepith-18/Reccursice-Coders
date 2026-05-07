package OOPS.RohanSir.Shape;

public class Rectangle implements Shape {
        double length;
        double width;
    @Override
    public double calculateArea() {
        return length*width;
    }
}
