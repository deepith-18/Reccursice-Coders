package RaghuSir.javaPrograms.TwoDMatrix;

public class MainMat3 {

    public static void main(String[] args) {


        System.out.println("Enter the first matrix : ");
        int [][] x = Matrix.readMatrix();

        System.out.println("Enter the second matrix : ");
        int [][] y = Matrix.readMatrix();

        System.out.println("User entered first matrix");
        Matrix.displayMatrix(x);

        System.out.println("User entered second matrix :");
        Matrix.displayMatrix(y);

         int [] [] sum = Matrix.addMatrix(x,y);

         if(sum != null){
             System.out.println("The sum of the matrix is");
             Matrix.displayMatrix(sum);
         }else{
             System.out.println("The both matrix order is different");
         }


    }
}
