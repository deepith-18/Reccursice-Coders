package RaghuSir.javaPrograms.Generics;

public class Calculator<T extends Number> {
    T data;

    public static void main(String[] args) {
        Calculator<Integer> c1 = new Calculator<Integer>();
        Calculator<Double> c2 = new Calculator<Double>();
//        Calculator<String> c3 = new Calculator<String>();  Not able to give as it extens number type only
    }
}
