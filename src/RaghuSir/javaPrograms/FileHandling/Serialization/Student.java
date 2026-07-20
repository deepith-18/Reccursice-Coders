package RaghuSir.javaPrograms.FileHandling.Serialization;
import java.io.Serializable;
public class Student implements Serializable {
    Integer id;
    String name;
    Double per;

    public Student(Integer id, String name, Double per) {
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

    public Double getPer() {
        return per;
    }

    public void setPer(Double per) {
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
}
