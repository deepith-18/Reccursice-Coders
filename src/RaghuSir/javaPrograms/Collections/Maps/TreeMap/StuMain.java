package RaghuSir.javaPrograms.Collections.Maps.TreeMap;

import java.util.*;

public class StuMain {

    public static void main(String[] args) {


        Student [] students = {
                new Student(101,"Akash",78.3),
                new Student(102,"Darshan",65.3),
                new Student(103,"Deepith",50.01),
                new Student(104,"Deekshi",78.3),
                new Student(105,"Gagana",89.0),
                new Student(106,"Unknown",36.54),
                new Student(107,"Sajan",78.3),
                new Student(108,"Rajan",97.32),
                new Student(109,"Unkowns",32.0)
        };

        LinkedHashMap<String, List<Student>> map = new LinkedHashMap<>();

       for(Student student : students){

           String grade;

           if(student.getScore()>=90.0){
               grade="Distinction";
           }else if(student.getScore()>=85.0) {
               grade = "First Class";
           }else if(student.getScore()>=60.0) {
               grade = "Second Class";
           }else if(student.getScore()>=35.0) {
               grade = "Pass";
           }else{
               grade = "Fail";
           }

           //If the for the first student the list is not created

           if(!map.containsKey(grade)){
               map.put(grade,new ArrayList<>());
           }

           map.get(grade).add(student);


           }


       for(Map.Entry<String , List<Student>> entry : map.entrySet()){
           System.out.println(entry.getKey()+" : "+entry.getValue());
       }





    }
}
