package OOPS.RohanSir.Shape;

public class Square extends Rectangle {

    double side;

    Square(double side){
        this.side=side;
    }

    public double calculateArea(){
        return side*side;
    }
}
