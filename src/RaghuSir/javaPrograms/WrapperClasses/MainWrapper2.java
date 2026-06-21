package RaghuSir.javaPrograms.WrapperClasses;

public class MainWrapper2 {
    public static void main(String[] args) {

        String hx = Integer.toHexString(30);
        System.out.println(hx);
        int v1 = Integer.parseInt("234");
        int v2 = Integer.parseInt("1001",2);
        System.out.println(v2);
        int v3 = Integer.parseInt("ABC",16);
        System.out.println(v3);
        int v4 = Integer.parseInt("234Deepu",0,3,10);
        System.out.println(v4);
    }
}
