package RaghuSir.javaPrograms.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIin {
    public static void main(String[] args) {

        try(FileInputStream fin = new FileInputStream("C:\\RCB\\src\\RaghuSir\\javaPrograms\\FileHandling\\FileIin.java")){
            while(true){
                int b = fin.read();
                if(b==-1){
                    break;
                }
                System.out.print((char)b);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
