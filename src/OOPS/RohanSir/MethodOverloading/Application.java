package OOPS.RohanSir.MethodOverloading;

public class Application {

    public void doPayment(long cardNo){
        System.out.println("Payment done through card of number:"+cardNo);
    }

    public  void doPayment(String upi){
        System.out.println("Payment done through upi:"+upi);
    }
    public void doPayment(double cash){
        System.out.println("Payment done through Cash"+ cash);
    }
}
