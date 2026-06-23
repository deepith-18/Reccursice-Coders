package RaghuSir.javaPrograms.ExceptionHandling.EmpOwnExamp;

public class Employee {

    private Integer empId;
    private String name;
    private int age;

    public Employee(Integer empId, String name, int age) {
        this.empId = empId;
        this.name = name;
        this.age = age;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[EmpId=" + empId + ", Name=" + name + ", Age=" + age + "]";
    }
}