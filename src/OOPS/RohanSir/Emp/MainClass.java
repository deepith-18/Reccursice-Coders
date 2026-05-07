package OOPS.RohanSir.Emp;

public class MainClass {

    public static void main(String[] args) {

        accessObject(new Developer());

    }

    public static void accessObject(Employee e){
        e.login();
        e.work();
        e.logout();
    }
}
