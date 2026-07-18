package RaghuSir.javaPrograms.FileHandling;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File f = new File("C:\\RCB\\src\\RaghuSir\\javaPrograms\\FileHandling\\MainRunner.java");
        System.out.println(f.exists());
    }
}
