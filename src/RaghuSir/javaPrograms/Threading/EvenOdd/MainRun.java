package RaghuSir.javaPrograms.Threading.EvenOdd;

public class MainRun {
    public static void main(String[] args) {

        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();
        odd.start();
    }
}
