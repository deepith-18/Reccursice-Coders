package RaghuSir.javaPrograms.Generics;

public class Box<T> {
    T data;

    Box(T data){
        this.data=data;
    }

    public void setData(T data){
        this.data= data;
    }
    public T getData(){
        return data;
    }
}
