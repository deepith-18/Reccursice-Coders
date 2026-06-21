package RaghuSir.javaPrograms.WrapperClasses;

public class MainWrapper1 {
    public static void main(String[] args) {
        Double a=34.56;
        int x = a.intValue();
        byte y = a.byteValue();
        float z = a.floatValue();
        short w = a.shortValue();
        long v= a.longValue();
        double t = a.doubleValue();
         t=a;
        System.out.println(x+" "+y+" "+z+" "+w+" "+v+" "+t);
    }
}
