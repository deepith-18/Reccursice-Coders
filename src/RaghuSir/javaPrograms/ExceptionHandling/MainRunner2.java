package RaghuSir.javaPrograms.ExceptionHandling;
import java.util.Arrays;
import java.util.*;
public class MainRunner2 {
    public static void main(String[] args) {

        Integer [] arr = {1,7,3,2,4,6,5};

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        // Local Inner Class
        /*
        class DescComparator implements Comparator<Integer>{
            @Override
            public int compare(Integer i1,Integer i2){
                return -i1.compareTo(i2);
            }
        }

        Comparator<Integer> desc = new DescComparator();
        Arrays.sort(arr,desc);
        System.out.println(Arrays.toString(arr));

        */


        //Anonymous Implementation

//        Comparator<Integer> desc = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i1, Integer i2) {
//                return -i1.compareTo(i2);
//            }
//        };
//        Arrays.sort(arr,desc);
//        System.out.println(Arrays.toString(arr));


        //Lamda Expression
//
//        Comparator<Integer> desc = (i1,i2)-> -i1.compareTo(i2);
//        Arrays.sort(arr,desc);
//        System.out.println(Arrays.toString(arr));


        Arrays.sort(arr,(i1,i2)-> -i1.compareTo(i2));
        System.out.println(Arrays.toString(arr));

    }
}
