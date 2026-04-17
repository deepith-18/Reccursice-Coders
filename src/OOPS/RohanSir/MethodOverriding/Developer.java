package OOPS.RohanSir.MethodOverriding;

public class Developer extends Employee {

    String time;

    Developer(String time){
        this.time=time;
    }

    @Override
    public  void login(){
        System.out.println("Developer logined at: "+this.time);
    }

    @Override
    public void work(){
        System.out.println("Developer started working at: "+this.time);
    }
}
