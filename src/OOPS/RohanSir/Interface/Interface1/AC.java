package OOPS.RohanSir.Interface.Interface1;

public class AC implements Electronics {

    @Override
    public void switchOn(){
        System.out.println("By the remote");
    }

    @Override
    public void switchOff(){
        System.out.println("By the switch");
    }
}
