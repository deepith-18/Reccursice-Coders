package OOPS.RohanSir.MethodOverriding;

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee();

        Developer d = new Developer("9:00");
        d.login();
        d.work();

        TestEngineer t = new TestEngineer("10:00");
        t.login();
        t.work();
    }
}
