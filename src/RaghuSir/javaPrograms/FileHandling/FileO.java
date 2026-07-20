package RaghuSir.javaPrograms.FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileO {

    public static void main(String[] args) {

        String str = "Welcome to RCB";
        FileOutputStream fout = null;
        try{
            fout = new FileOutputStream("C:\\RCB\\src\\RaghuSir\\javaPrograms\\FileHandling\\Deepu.txt");
            byte[] bytes = str.getBytes();
            fout.write(bytes);
            System.out.println("Successfully wrote to the file");
        }catch (IOException e){
            System.out.println(e);
        }finally {
            try{
                fout.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
