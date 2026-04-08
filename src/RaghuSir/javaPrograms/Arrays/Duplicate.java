package RaghuSir.javaPrograms.Arrays;

public class Duplicate {
    public static void main(String[] args) {
    int[]a = {1,2,3,4,5};
    int[]b = duplicate(a);
        System.out.println(a==b);
    }
    static int[] duplicate(int[]x){
        int[]y = new int[x.length];
        for(int i=0;i< x.length;i++){
            y[i]=x[i];
        }
        return y;
    }

}

