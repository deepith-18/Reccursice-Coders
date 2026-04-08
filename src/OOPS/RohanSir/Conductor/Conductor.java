package OOPS.RohanSir.Conductor;

import java.sql.SQLOutput;

public class Conductor {
    String name;

    Conductor(String name){
        this.name=name;
    }
    public void issue(){
        Tickect t = new Tickect("Banglore","Mysore");

        System.out.println(this.name + " issuing the ticket from "+t.from+" to "+t.to);
    }
}
