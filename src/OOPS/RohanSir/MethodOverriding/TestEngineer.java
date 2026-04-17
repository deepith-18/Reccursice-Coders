package OOPS.RohanSir.MethodOverriding;

public class TestEngineer  extends Employee{

    String time;

    TestEngineer(String time){
        this.time=time;
    }
    @Override
    public void login(){
        System.out.println("Test Engg logined at: "+this.time);
    }

    @Override
    public void work(){
        System.out.println("Test Engg started working at: "+this.time);
    }
}
