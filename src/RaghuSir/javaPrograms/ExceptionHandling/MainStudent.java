package RaghuSir.javaPrograms.ExceptionHandling;
import java.util.Arrays;
import java.util.Comparator;

public class MainStudent {

 static  class NameComparator implements Comparator<Student>{
     @Override
     public int compare(Student s1,Student s2){
         return s1.getName().compareTo(s2.getName());
     }
 }

  static class PercentageComparator implements Comparator<Student>{
     @Override
     public int compare(Student s1,Student s2){
         return s1.getPer().compareTo(s2.getPer());
     }
 }








    public static void main(String[] args) {

        Student s1=new Student(123,"Ramesh",76.56,23);
        Student s2=new Student(125,"Suresh",78.45,24);
        Student s3=new Student(165,"Ramu",56.23,22);
        Student s4=new Student(187,"Aktar",87.43,21);
        Student s5=new Student(129,"Quere",67.34,25);
        Student s6=new Student(198,"harks",90.34,26);
        Student s7=new Student(121,"refds",65.34,28);

        Student [] students = {s1,s2,s3,s4,s5,s6,s7};

        for(Student std:students){
            System.out.println(std);
        }

        Comparator<Student> id = new IdComparator();
        Arrays.sort(students);
        System.out.println("After sort");
        for(Student std:students){
            System.out.println(std);
        }


        class  AgeComparator implements Comparator<Student>{
            @Override
            public int compare(Student s1,Student s2){
                return s1.getAge().compareTo(s2.getAge());
            }
        }

        Comparator<Student> name = new NameComparator();
        System.out.println("Sort based On name");
        Arrays.sort(students,name);
        for(Student std:students){
            System.out.println(std);
        }

        Comparator<Student> per = new PercentageComparator();
        Arrays.sort(students,per);
        for(Student std:students){
            System.out.println(std);
        }

        System.out.println();
        System.out.println("After Age sort");
        Comparator<Student> age = new AgeComparator();
        Arrays.sort(students,age);
        for(Student std:students){
            System.out.println(std);
        }



    }
}
