package OOPS.RohanSir.SuperClass;

public class Student extends Person{

    int id;
    double marks;

    Student(String name,int age,int id,double marks){
        super(name,age);
        this.id=id;
        this.marks=marks;
    }
}
