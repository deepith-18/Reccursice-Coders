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



}
