package RaghuSir.javaPrograms.Collections.Sets.TreeSet;

public class Employee implements Comparable<Object> {
    private Integer eid;
    private String ename;
    private Integer age;

    public Employee(Integer eid, String ename, Integer age) {
        this.eid = eid;
        this.ename = ename;
        this.age = age;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename=" + ename +
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

        return Integer.compare(this.age, age)>0?-1:1;
    }

}
