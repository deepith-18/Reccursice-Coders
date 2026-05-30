package OOPS.RohanSir.EqualsMethod;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(25);
        Employee e2 = new Employee(35);
        Laptop l = new Laptop();
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1.equals(e2));
        System.out.println(e2.equals(e1));
        System.out.println(e2.equals(l));
        System.out.println(l.equals(e1));
    }
}
