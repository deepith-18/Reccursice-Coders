package RaghuSir.javaPrograms.Reccursion;

public class PaperSize {
    public static void main(String[] args) {
        papersize(1189,841,0);
    }
    static void papersize(int l,int w,int n){
        if(n==8){
            return;
        }
        System.out.println("A"+n+"l: "+l+"w: "+w);
        papersize(w,l/2,n+1);
    }
}
