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
    static boolean isSquareMat(int[][]x){
        return x.length == x[0].length;
    }

    static int[][] subtractMatrix(int[][]x,int[][]y){
        if(x.length != y.length || x[0].length != y[0].length){
            return null;
        }
        int [][]z = new int[x.length][x[0].length];
        for(int i=0;i<z.length;i++){
            for(int j=0;j<z[i].length;j++){
                z[i][j]=x[i][j]-y[i][j];
            }
        }
        return z;
    }

    static void evenOddCount(int[][]mat){
        int evenCount=0;
        int oddCount=0;

        for(int[] row:mat){
            for(int elem:row){
                if(elem%2==0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
        }
        System.out.println("Even count is : "+evenCount);
        System.out.println("Odd count is : "+oddCount);
    }

    static  int primeCount(int[][]mat){

        int count = 0;

        for(int[]row :mat){
            for(int ele:row){

                if(ele >1){

                    boolean isPrime = true;
                    for(int i=2;i<ele/2;i++){
                        if(ele%i==0){
                            isPrime=false;
                            break;
                        }
                    }
                    if(isPrime){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    static int diseriumCount(int[][]mat){

        int count=0;

        for(int[]row:mat){
            for(int ele:row){

                String s = String.valueOf(ele);
                int sum=0;

                for(int i=0;i<s.length();i++){
                    int digit = s.charAt(i)-'0';
                    sum+= Math.pow(digit,i+1);
                }
                if(sum==ele){
                    count++;
                }
            }
        }
        return count;
    }

    static int[] rowWiseSum(int[][]mat){
        int []rows= new int[mat.length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                rows[i]=rows[i]+mat[i][j];
            }
        }
        return rows;
    }


    static  int[] colWiseSum(int [][]mat){
        int []col = new int[mat[0].length];

        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                col[i] += mat[j][i];
            }
        }
        return col;
    }

    static int[] rowWiseBig(int[][]mat) {
        int[] big = new int[mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(big[i] > mat[i][j]){
                    big[i]=mat[i][j];
                }
            }
        }
        return big;

    }

    static int[] rowWiseBig1(int[][]mat) {
        int[] rb = new int[mat.length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                rb[i]=mat[0][j];
                if(rb[i] > mat[i][j]){
                    rb[i]=mat[i][j];
                }
            }
        }
        return rb;

    }


    static int[] colWiseBig1(int[][]mat) {
        int[] rb = new int[mat.length];

        for(int i=0;i<mat[i].length;i++){
            for(int j=0;j<mat.length;j++){
                rb[i]=mat[i][0];
                if(rb[i] > mat[i][j]){
                    rb[i]=mat[i][j];
                }
            }
        }
        return rb;

    }


    static void rowWiseSwap(int[][]mat){
        for(int i=0;i<mat.length;i++){
            int l=0,h=mat[i].length-1;
            while(l<h){
                int temp = mat[i][l];
                mat[l][i]=mat[i][h];
                mat[i][h]=temp;
                l++;
                h--;
            }
        }
    }

    static void colWiseReverse(int [][]mat){
        for(int i=0;i<mat[0].length;i++){
            int l=0,h=mat[i].length-1;
            while(l<h){
                int temp = mat[l][i];
                mat[l][i]=mat[h][i];
                mat[h][i]=temp;
                l++;
                h--;
            }
        }



    }

    static void diagonelWiseReverse(int [][]mat){
        int l=0,h=mat.length-1;

        while(l<h){

            int temp= mat[l][l];
            mat[l][l]=mat[h][h];
            mat[h][h]=temp;

            temp = mat[l][h];
            mat[l][h]=mat[h][l];
            mat[h][l]=temp;

            l++;
            h--;
        }
        }
    static int[] diagonelWiseSum(int [][]mat){
        int psum=0,ssum=0;

        for(int i=0;i<mat.length;i++){
            psum = psum + mat[i][i];
            ssum = ssum + mat[i][mat.length-1-i];
        }
        return new int[]{psum,ssum};
    }

    static int[] diagonelWiseBig(int[][]mat){
        int pbig = mat[0][0],sbig = mat[0][mat.length-1];

        for(int i=0;i<mat.length;i++){

            if(mat[i][i]>pbig){
                pbig=mat[i][i];
            }
            if(mat[i][mat.length-1-i]>sbig){
                sbig=mat[i][mat.length-1-i];
            }

        }
        return new int[]{pbig,sbig};
    }

    static void transposeSquareMat(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;i<mat[i].length;i++){
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }


    static int[][] multiplyMat(int[][]x,int[][]y){
        if(x[0].length != y.length){
            return null;
        }

        int[][] z = new int[x.length][y[0].length];

        for(int i=0;i<x.length;i++){
            for(int j=0;j<y[0].length;j++){
                for(int k=0;k<y.length;k++){
                    z[i][j] = z[i][j] + x[i][k] * y[k][j];
                }
            }
        }
        return z;
    }


    static void spiralMatrix(int[][]mat){
        int n = mat.length;

        for(int i=0,j=n-1;i<j;i++,j--){
            for(int k=0;k<j;k++){
                System.out.print(mat[i][k]+" ");
            }
            for(int k=i;k<j;k++){
                System.out.print(mat[k][j]+" ");
            }
            for(int k=j;k>i;k--){
                System.out.print(mat[j][k]+" ");
            }
            for(int k=j;k>i;k--){
                System.out.print(mat[k][i]+" ");
            }
            if(n%2 == 1){
                System.out.print(mat[n/2][n/2]);
            }
        }
    }

    static void antiSpiralMatrix(int[][]mat){
        int n = mat.length;

        for(int i=0,j=n-1;i<j;i++,j--){
            for(int k=0;k<j;k++){
                System.out.print(mat[k][i]+" ");
            }
            for(int k=i;k<j;k++){
                System.out.print(mat[j][k]+" ");
            }
            for(int k=j;k>i;k--){
                System.out.print(mat[k][j]+" ");
            }
            for(int k=j;k>i;k--){
                System.out.print(mat[i][k]+" ");
            }
            if(n%2 == 1){
                System.out.print(mat[n/2][n/2]);
            }
        }
    }




}
