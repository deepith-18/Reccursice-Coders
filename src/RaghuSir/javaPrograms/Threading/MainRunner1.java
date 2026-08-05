package RaghuSir.javaPrograms.Threading;

public class MainRunner1 {

    public static void main(String[] args) {

        CapitalThread ct = new CapitalThread();
        SmallThread st = new SmallThread();

        ct.start();
        st.start();

    }
}
