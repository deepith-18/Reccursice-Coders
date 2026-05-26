package RaghuSir.javaPrograms.TwoDMatrix;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order that is no of rows and cols: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] mat= new int[row][col];
        System.out.println("Enter the "+row*col+"values row wise: ");

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        System.out.println("User entered matrix: ");

        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

        int sum = sumOfMatrix(mat);
        System.out.println("Sum of the matrix: "+sum);
    }

    static int sumOfMatrix(int[][]x){
        int sum=0;
        for(int [] ar:x){
            for(int ele:ar){
                sum+=ele;
            }
        }
        return sum;
    }


}
