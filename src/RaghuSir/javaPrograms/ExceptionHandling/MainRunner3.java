package RaghuSir.javaPrograms.ExceptionHandling;

import java.util.Arrays;
import java.util.Comparator;

public class MainRunner3 {
    public static void main(String[] args) {

        Student s1=new Student(123,"Ramesh",76.56,23);
        Student s2=new Student(125,"Suresh",78.45,24);
        Student s3=new Student(165,"Ramu",56.23,22);
        Student s4=new Student(187,"Aktar",87.43,21);
        Student s5=new Student(129,"Quere",67.34,25);
        Student s6=new Student(198,"harks",90.34,26);
        Student s7=new Student(121,"refds",65.34,28);

        Student [] students = {s1,s2,s3,s4,s5,s6,s7};

        Comparator<Student> idComparator=(st1,st2)-> st1.getId().compareTo(st2.getId());
        Arrays.sort(students,idComparator);

        for(Student std:students){
            System.out.println(std);
        }

        System.out.println("-------------------------");

       Arrays.sort(students,(std1,std2)->std1.getPer().compareTo(std2.getPer()));
        for(Student std:students){
            System.out.println(std);
        }

        System.out.println("-------------------------");

        Comparator<Student> lenComp=(x1,x2)->new Integer(x1.getName().length()).compareTo(x2.getName().length());
        Arrays.sort(students,lenComp);
        for(Student std:students){
            System.out.println(std);
        }

    }
}
