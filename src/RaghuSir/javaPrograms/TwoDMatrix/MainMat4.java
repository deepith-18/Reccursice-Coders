package RaghuSir.javaPrograms.TwoDMatrix;

public class MainMat4 {
    public static void main(String[] args) {

        System.out.println("Enter the first matrix : ");
        int [][] x = Matrix.readMatrix();

        System.out.println("User entered matrix");
        Matrix.displayMatrix(x);
//        int[] rowSum= Matrix.rowWiseSum(x);
//
//        for(int i=0;i<rowSum.length;i++){
//            System.out.println(i+1+"row sum is "+rowSum[i]);
//        }

        int[] rBig = Matrix.rowWiseBig(x);
        for(int j=0;j<rBig.length;j++){
            System.out.println(j+1+"row sum is "+rBig[j]);
        }


    }
}
