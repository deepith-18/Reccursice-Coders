package RaghuSir.javaPrograms.FileHandling;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class MultiplefileWrite {

    public static void main(String[] args) {

        File dir = new File("C:\\RCB\\src\\RaghuSir\\javaPrograms\\WrapperClasses");

        // Check if the directory exists
        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Directory not found!");
            return;
        }

        Vector<InputStream> vector = new Vector<>();

        // Add all .java files to the Vector
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".java")) {
                    try {
                        System.out.println("Adding: " + file.getName());
                        vector.add(new FileInputStream(file));
                    } catch (FileNotFoundException e) {
                        System.out.println("Cannot open: " + file.getName());
                    }
                }
            }
        }

        if (vector.isEmpty()) {
            System.out.println("No .java files found.");
            return;
        }

        Enumeration<InputStream> en = vector.elements();

        try (
                SequenceInputStream sis = new SequenceInputStream(en);
                FileOutputStream fout = new FileOutputStream(
                        "C:\\RCB\\src\\RaghuSir\\javaPrograms\\FileHandling\\myprogram.txt")
        ) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = sis.read(buffer)) != -1) {
                fout.write(buffer, 0, bytesRead);
            }

            System.out.println("Files merged successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}