package RaghuSir.javaPrograms.Generics;

public class MainGenerics {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<Integer>(2);
        Box<Double> b2= new Box<Double>(23.3);
        Box<String> b3 = new Box<String>("Hi");

        b1.setData(23);

        Box b4 = new Box('A');
        System.out.println(b4.getData());
    }
}
