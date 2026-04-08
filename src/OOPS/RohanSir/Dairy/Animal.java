package OOPS.RohanSir.Dairy;

public class Animal {
    String cowName;
   Animal(String cowName){
        this.cowName=cowName;
    }
    public void gives(){
        Milk m = new Milk(6);
        System.out.println(this.cowName+ " gives liters "  + m.liters +" of milk");
    }
}
