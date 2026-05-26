package RaghuSir.javaPrograms.TwoDMatrix;

public class MainMat2 {
    public static void main(String[] args) {

        int[][]x=Matrix.readMatrix();
        System.out.println("User entered matrix");

        Matrix.displayMatrix(x);


        int big = Matrix.getBiggest(x);
        System.out.println("Biggest elem: "+big);

        int small = Matrix.getSmallest(x);
        System.out.println("Smallest elem: "+small);


    }
}
