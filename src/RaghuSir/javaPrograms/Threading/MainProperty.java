package RaghuSir.javaPrograms.Threading;

public class MainProperty {

    public static void main(String[] args) {

        Thread t1 = new Thread();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        System.out.println(t1);

        t1.setName("Deepith");
        System.out.println(t1);
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
    }
}
