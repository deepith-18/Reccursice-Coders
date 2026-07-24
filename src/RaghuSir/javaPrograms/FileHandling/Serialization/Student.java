package RaghuSir.javaPrograms.FileHandling.Serialization;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private Double per;

    public Student(Integer id, String name, Double per) {
        this.id = id;
        this.name = name;
        this.per = per;
    }

    public static Student readStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        Integer id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Percentage: ");
        Double per = sc.nextDouble();

        return new Student(id, name, per);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPer() {
        return per;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", per=" + per +
                '}';
    }
}