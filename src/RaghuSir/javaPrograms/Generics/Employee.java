package RaghuSir.javaPrograms.Generics;

public class Employee<T,W> {
    private T eid;
    private W ename;

    public Employee(T eid,W ename){
        this.eid=eid;
        this.ename=ename;
    }


    public T getEid(){
        return eid;
    }
    public W getEname(){
        return ename;
    }

    public void setEid(T eid) {
        this.eid = eid;
    }

    public void setEname(W ename) {
        this.ename = ename;
    }
}
