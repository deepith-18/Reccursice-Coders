package RaghuSir.javaPrograms.Arrays;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int [] a ={3,5,7,8,9};
        int [] b = {1,2,3};

        int[] arr = {1,2,3,4,5};
//        System.out.println(Arrays.toString(mergeAsc(a,b)));


//        System.out.println(Arrays.toString( insert(a,2,6)));;

//        System.out.println(Arrays.toString(delete(a,2)));
        int d=3;
        d = d % arr.length;

        leftRotate(arr,0, arr.length-1);
        leftRotate(arr,0,d-1);
        leftRotate(arr,d,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] merge(int[] a,int[] b){
        int [] z = new int[a.length+b.length];

        for(int i=0;i<a.length;i++){
            z[i]=a[i];
        }
        for(int j=0;j<b.length;j++){
            z[a.length+j]=b[j];
        }
        return z;
    }

    public static int[] zigZag(int[]a,int[] b){
        int[] c = new int[a.length+b.length];
        int i=0,k=0;

        while(i<a.length && i<b.length){

        c[k++]=a[i];
        c[k++]=b[i++];

        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(i<b.length){
            c[k++]=b[i++];
        }

        return c;

    }

    static int[] mergeAsc(int []a,int[] b){
        int[] c = new int[a.length+b.length];
        int i=0,j=0,k=0;

        while(i<a.length && j<b.length ){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }else{
                c[k++]=b[j++];
            }
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length){
            c[k++]=b[j++];
        }
        return c;
    }

    static int[] insert(int[] arr,int index,int elem) {
        int[] newArr = new int[arr.length + 1];

            if(index <0|| index > arr.length){
                System.out.println("Enter valid index");
        }
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = elem;

        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
    return newArr;
    }

        static int[] delete(int[]arr,int index){
            int[] newArr = new int[arr.length-1];

            for(int i=0;i<index;i++){
                newArr[i]= arr[i];
            }
            for(int i=index;i<newArr.length;i++){
                newArr[i]=arr[i+1];
            }
            return newArr;

        }

//        static int[] nthBiggest(int[] arr){
//
//        }

    static int[] insertR(int[] arr,int val,int index){
        if(index <0 || index>arr.length){
            System.out.println("Enter valid index to insert the element");
            return arr;
        }
        int[] newArr = new int[arr.length+1];
        newArr[index]=val;

        for(int i=0;i<arr.length;i++){
            if(i<index){
                newArr[i]= arr[i];
            }else{
                newArr[i+1] = arr[i];
            }
        }
        return newArr;
    }


    static int[] delete2(int[] arr,int index){
        if(index <0 || index >arr.length){
            System.out.println("Enter the valid index range");
        }
        int[] newArr = new int[arr.length-1];

        for(int i=0;i< newArr.length;i++){
            if(i<index){
                newArr[i]=arr[i];
            }else{
                newArr[i]=arr[i+1];
            }
        }
        return newArr;
    }

    static int[] rightRotate(int[] arr,int r){
        r = r%arr.length;

        int[] newArr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[(i-r+arr.length)/arr.length];
        }
        return newArr;
    }


    static void leftRotate(int[]arr,int start,int end){

            while(start < end){
                int temp = arr[start];
                arr[start++]=arr[end];
                arr[end--]=temp;
            }


    }


}
