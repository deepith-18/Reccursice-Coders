package RaghuSir.javaPrograms.Collections;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Iterator;

public class StudentExSet {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();
        students.add(new Student(121,"Ramesh",78.43));
        students.add(new Student(121,"Rajesh",78.43));
        students.add(new Student(123,"Roopesh",78.43));
        students.add(new Student(124,"Ranjesh",78.43));
        students.add(new Student(125,"Rahul",78.43));

      Iterator<Student> itr = students.iterator();
      while(itr.hasNext()){
          System.out.println(itr.next());
      }
    }
}
