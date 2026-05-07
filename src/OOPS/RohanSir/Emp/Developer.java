package OOPS.RohanSir.Emp;

public class Developer implements Employee{

    @Override
    public void login(){
        System.out.println("Developer login at 10");
    }

    @Override
    public  void work(){
        System.out.println("Developer working in Java code");
    }

    @Override
    public  void logout(){
        System.out.println("Developer logout at 5");
    }
}
