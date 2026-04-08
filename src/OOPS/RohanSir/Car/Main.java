package OOPS.RohanSir.Car;

public class Main {
    public static void main(String[] args) {
        Engine eng = new Engine(400,6);
        Car car = new Car("Hero","Black",eng);
        car.displayCarDetails();

    }
}
