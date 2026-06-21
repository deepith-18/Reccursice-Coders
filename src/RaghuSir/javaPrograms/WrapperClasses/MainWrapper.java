package RaghuSir.javaPrograms.WrapperClasses;

public class MainWrapper {
    public static void main(String[] args) {
//        Integer x = new Integer(45);
//        System.out.println(x);
//        Double y = 34.43;
//        System.out.println(y);
//        System.out.println(x.hashCode());
//        System.out.println(y.hashCode());

        Double a =34.34;
        Double b = 34.34;
        Double c = 45.43;
        System.out.println(a.equals(b));
        System.out.println(a==b);

        System.out.println(a.equals(c));
        System.out.println(a==c);

        System.out.println(a.equals(10));
        System.out.println(10==10.0);

        System.out.println(a.equals(34.34));

        Double x=10.0;
        System.out.println(x.equals(10.0)); //If Stored in the Wrapper false
        System.out.println(x==10);//true not compared with the Wrapper

    }
}
