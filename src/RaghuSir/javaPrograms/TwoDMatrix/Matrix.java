package RaghuSir.javaPrograms.TwoDMatrix;

import java.util.Scanner;

public class Matrix {


    static int[][] readMatrix(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the order that is no of rows and cols: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] mat= new int[row][col];
        System.out.println("Enter the "+row*col+"values rowise: ");

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        return mat;
    }

    static void displayMatrix(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        }

    static int getBiggest(int[][]mat){
        int big = Integer.MIN_VALUE;
        for(int[] row:mat){
            for(int ele:row){
                if(ele>big){
                    big = ele;
                }
            }
        }
        return big;
    }

    static int getSmallest(int [][]mat){
        int small = Integer.MAX_VALUE;
        for(int[] row:mat){
            for(int ele:row){
                if(ele<small){
                    small = ele;
                }
            }
        }
        return small;
    }

    static  int[][] addMatrix(int[][]x,int[][]y){
      if(x.length!=y.length || x[0].length != y[0].length){
          return null;
      }
      int[][]z = new int[x.length][x[0].length];
        for(int i=0;i<z.length;i++){
            for(int j=0;j<z[i].length;j++){
                z[i][j]=x[i][j]+y[i][j];
            }
        }
        return z;
    }
}
