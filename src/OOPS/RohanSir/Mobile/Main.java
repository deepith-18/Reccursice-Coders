package OOPS.RohanSir.Mobile;

public class Main {
    public static void main(String[] args) {
        Mobile[] mobiles = new Mobile[4];

        Mobile m1= new Mobile("VIVO","Black");
        Mobile m2 = new Mobile("Huwai","Red");
        Mobile m3 = new Mobile("Samsung","White");
        Mobile m4 = new Mobile("1+","Green");

        mobiles[0]=m1;
        mobiles[1]=m2;
        mobiles[2]=m3;
        mobiles[3]=m4;



        for(int i=0;i<mobiles.length;i++){
            System.out.println(mobiles[i].brand+" "+mobiles[i].color);
        }


    }
}
