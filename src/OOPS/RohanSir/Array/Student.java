package OOPS.RohanSir.Array;

public class Student {
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void displayDetails(){
        System.out.println("Student ID : "+this.id);
        System.out.println("Student Name : "+this.name);

    }
}
