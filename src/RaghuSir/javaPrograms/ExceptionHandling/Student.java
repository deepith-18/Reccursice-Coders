package RaghuSir.javaPrograms.ExceptionHandling;

public class Student implements Comparable<Student> {
    private Integer id;
    private String name;
    private Double per;
    private  Integer age;

    public Student(Integer id, String name,Double per,Integer age){
        this.id=id;
        this.name=name;
        this.per=per;
        this.age=age;
    }

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public Double getPer(){
        return per;
    }
    public void setPer(Double per){
        this.per=per;
    }
    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public  String toString(){
        return "Student [ id="+id+" ,name="+name+" ,per="+per+" ,age="+age+"]";
    }

    @Override
    public int compareTo(Student std){
        return this.id.compareTo(std.getId());
    }
}
