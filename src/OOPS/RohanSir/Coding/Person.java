package OOPS.RohanSir.Coding;

public class Person {
    String name;
    String pl;

    Person(String name,String pl){
        this.name=name;
        this.pl=pl;
    }
    public void coding(){
        Laptop l = new Laptop("Dell");
        System.out.println(this.name+" is coding "+this.pl+" program in " +l.brand+" Laptop");

    }
}
