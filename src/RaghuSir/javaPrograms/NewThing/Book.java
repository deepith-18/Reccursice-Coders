package RaghuSir.javaPrograms.NewThing;

import java.util.Stack;

public class Book {
    public static void main(String[] args) {
    int total=10;
    int pos = 6;

    int n=5;
    int ans =ways(n);
        System.out.println(ans);
    }

    static int countBooks(int total,int pos){
        int count=0;

        if(pos== 1){
            return count+1;
        }
        return 1+countBooks(total,pos-1);
    }


    static int ways(int n){
        if(n==1 || n==2||n==3){
            return n;
        }


        return ways(n-1)+ways(n-2);
    }



    }

