package OOPS.RohanSir.NonPrimitiveTypeasting;

public class Main {
    public static void main(String[] args) {

        // 🔹 Upcasting (Child → Parent)
        Vehicle v1 = new ElectricBike("Yamaha", 90000, "KA01AB1234","Amazon");
        Vehicle v2 = new Car("BMW", 5000000, "KA02XY9999");
        Vehicle v3 = new ElectricBike("Ola", 120000, "KA05EV1234", "Lithium");

//       Normal Detials

        System.out.println(v1.getBrand()+" "+v1.getPrice());
        System.out.println(v2.getBrand() + " " + v2.getPrice());
        System.out.println(v3.getBrand() + " " + v3.getPrice());

        System.out.println("-------------");

        //  Downcasting + specific getters

        if (v1 instanceof Bike) {
            Bike b = (Bike) v1;
            System.out.println("Bike No: " + b.getBikeNo());
            b.ride();
        }

        if (v2 instanceof Car) {
            Car c = (Car) v2;
            System.out.println("Car No: " + c.getCarNo());
            c.drive();
        }

        if (v3 instanceof ElectricBike) {
            ElectricBike eb = (ElectricBike) v3;
            System.out.println("Battery: " + eb.getBatteryType());
            eb.chargeBattery();
        }

    }

}