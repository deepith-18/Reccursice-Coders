package RaghuSir.javaPrograms.Collections.Sets.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Student implements Comparable<Object> {

    private Integer id;
    private String name;
    private Integer age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object other) {
        int age = 0;

        if (other instanceof Student) {
            age = ((Student) other).getAge();
        } else if (other instanceof Customer) {
            age = ((Customer) other).getAge();
        } else if (other instanceof Employee) {
            age = ((Employee) other).getAge();
        }

        return Integer.compare(this.age, age);
    }
}
