package OOPS.RohanSir.Emp;

public class TestEngg implements Employee{

    @Override
    public void login(){
        System.out.println("TestEngg login at 11");
    }

    @Override
    public  void work(){
        System.out.println("TestEngg fixing in Java code");
    }

    @Override
    public  void logout(){
        System.out.println("TestEngg logout at 6");
    }
}
