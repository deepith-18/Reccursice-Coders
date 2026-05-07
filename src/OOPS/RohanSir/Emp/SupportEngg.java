package OOPS.RohanSir.Emp;

public class SupportEngg implements Employee{

    @Override
    public void login(){
        System.out.println("Support login at 2");
    }

    @Override
    public  void work(){
        System.out.println("Support Engg issuing the ticket");
    }

    @Override
    public  void logout(){
        System.out.println("Support Engg logout at 10");
    }
}
