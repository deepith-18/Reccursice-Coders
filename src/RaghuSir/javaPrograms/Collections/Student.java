package RaghuSir.javaPrograms.Collections;

import java.util.Objects;

public class Student {
    Integer id;
    String name;
    Double per;

    public Student(Integer id, String name, double per) {
        this.id = id;
        this.name = name;
        this.per = per;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", per=" + per +
                '}';
    }
@Override
public int hashCode(){

        return this.id.hashCode();
}

@Override
public boolean equals(Object o){
        return this.id.hashCode()==o.hashCode();
}
}
