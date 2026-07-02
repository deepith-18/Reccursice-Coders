package RaghuSir.javaPrograms.Collections;

public class Customer {
    Integer cid;
    String cname;
    Integer age;

    public Customer(Integer cid, String cname, Integer age) {
        this.cid = cid;
        this.cname = cname;
        this.age = age;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        return this.age.hashCode()==obj.hashCode();
    }

    public int hashCode(){
        return this.age.hashCode();
    };


}
