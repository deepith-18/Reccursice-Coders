package RaghuSir.javaPrograms.Collections.Maps.TreeMap;

public class Employee {
   private Integer eid;
   private String name;
   private String dept;

    public Employee(Integer eid, String name, String dept) {
        this.eid = eid;
        this.name = name;
        this.dept = dept;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
