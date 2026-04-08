package OOPS.RohanSir;

public class Blocks {
    static{
        System.out.println("Start static block");
    }
    public static void main(String[] args) {
        System.out.println("start");
        new Blocks();
        System.out.println("End");
        new Blocks();
    }
    static {
        System.out.println("Static block");
    }
   static {
        System.out.println("static block2");
    }
    {
        System.out.println("Non static block1");
    }
    {
        System.out.println("non static block 2");
    }
}
