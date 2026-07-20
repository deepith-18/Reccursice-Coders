package RaghuSir.javaPrograms.FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Contentfile {

    public static void main(String[] args) throws IOException, InterruptedException {

        FileInputStream f1 = new FileInputStream("C:\\RCB\\src\\Practice.java");
        FileOutputStream fout = new FileOutputStream("C:\\RCB\\src\\Names.java",true);

        int b=0;
        while((b=f1.read())!=-1){
            fout.write(b);
            System.out.print((char)b);
            Thread.sleep(15);
        }
        fout.flush();
        f1.close();
        fout.close();
        System.out.println("Done");

    }

}
