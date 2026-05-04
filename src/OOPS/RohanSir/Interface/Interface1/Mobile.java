package OOPS.RohanSir.Interface.Interface1;

public class Mobile implements Electronics{

    @Override
    public  void switchOn(){
        System.out.println("By the double tap on  screen");
    }

    @Override
    public void switchOff(){
        System.out.println("By button");
    }
}
