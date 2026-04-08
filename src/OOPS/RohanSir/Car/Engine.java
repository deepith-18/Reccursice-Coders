package OOPS.RohanSir.Car;

public class Engine {
    int cc;
    int nocy;

    Engine(int cc,int nocy){
        this.cc=cc;
        this.nocy=nocy;
    }

    public void displayEngineDetails(){
        System.out.println("Engine CC: "+this.cc);
        System.out.println("Engine Number of Cylinder: "+this.nocy);
    }

}
