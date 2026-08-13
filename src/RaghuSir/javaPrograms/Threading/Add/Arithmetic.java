package RaghuSir.javaPrograms.Threading.Add;

public class Arithmetic {
    int a,b;
    Arithmetic(int a,int b){
        this.a=a;
        this.b=b;
    }

    synchronized void add(){
        System.out.println("A value is : "+a);
        System.out.println("B value is : "+b);

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Addition is : "+(a+b));
    }
   synchronized void modify(int a,int b){
    this.a+=a;
     this.b+=b;
    }
}
