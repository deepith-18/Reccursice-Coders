package RaghuSir.javaPrograms.Collections.Sets.TreeSet;

public class Customer implements Comparable<Object> {
    private Integer cid;
    private String name;
    private Integer age;

    public Customer(Integer cid, String name, Integer age) {
        this.cid = cid;
        this.name = name;
        this.age = age;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
