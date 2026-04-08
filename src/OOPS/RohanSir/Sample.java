package OOPS.RohanSir;

public class Sample {
    
    public static void main(String[] args) {
        System.out.println("Start");
        Sample s = new Sample();
        m1();
        Sample.m1();
        s.m1();

        s.m2();
        System.out.println("End");
    }
    public static void m1(){
        System.out.println("Static method");
    }

    public void m2(){
        System.out.println("Non static method");
    }
}
